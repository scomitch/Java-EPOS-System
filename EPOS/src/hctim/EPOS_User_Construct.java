/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hctim;

import java.awt.HeadlessException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hsqldb.rights.User;

/**
 *
 * @author 30246059
 */
public class EPOS_User_Construct {
    
    //Defines for the user.
    private int userID;
    private String userPin;
    private String userFirstname;
    private String userLastname;
    private int userRole;
    private User user;
    //-- End Defines -- 
    
    public EPOS_User_Construct(){
        //Constructor for the class.
    }
    
    public EPOS_User_Construct(int pUserID, String pUserPin, String pFirstname, String pLastname, int pRole){
        
        //Single Conditional
        if(pFirstname != null || pLastname != null){
            if(pUserID < 10000 || pRole > 1 || pRole < 0){
                JOptionPane.showMessageDialog(null, "UserID / UserPin must be greater than 10000 and Role must be 0 or 1");
                return;
            }
        }
        
        //Setting over-ride.
        this.userID = pUserID;
        this.userPin = pUserPin;
        this.userFirstname = pFirstname;
        this.userLastname = pLastname;
        this.userRole = pRole;
        
    }

    //Getters
    public int getUserID() {
        return userID;
    }

    public String getUserPin() {
        return userPin;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public int getUserRole() {
        return userRole;
    }
    
    public String getUserFullname(){
        return userFirstname + " " + userLastname;
    }
    
    public User getUser(){
        return user;
    }

    //Setters
    public void setUserID(int userID) {
        if(userID > 10000) {
            this.userID = userID;
        } else {
            JOptionPane.showMessageDialog(null, "User ID must be over 10000");
        }
    }

//    public void setUserPin(int userPin) {
//        if(userPin > 10000) {
//            this.userPin = userPin;
//        } else {
//            JOptionPane.showMessageDialog(null, "Pin must be over 10000");
//        }
//    }

    public void setUserFirstname(String userFirstname) {
        if(!userFirstname.equals("")){
            this.userFirstname = userFirstname;
        } else {
            JOptionPane.showMessageDialog(null, "Firstname must be filled out");
        }
    }

    public void setUserLastname(String userLastname) {
        if(!userLastname.equals("")){
            this.userLastname = userLastname;
        } else {
            JOptionPane.showMessageDialog(null, "Lastname must be filled out");
        }
    }

    public void setUserRole(int userRole) {
        if(userRole <= 1 && userRole >= 0){
            this.userRole = userRole;
        } else {
            JOptionPane.showMessageDialog(null, "Role must be 0 or 1");
        }
    }
    
    public static int createUserToDatabase(String userPin, int userID, String userFN, String userLN, int userManager){
        
        //Defines.
        String finhash;
        Connection con = EPOS_Database_Utilities.getConnection();
        
        /**
         * All passwords are secured through SHA-256.
         * We will get the string variation of their pin and parse it through a
         * secure one-way hashing algorithm (Through MessageDigest). 
         */
        try {
            //Guards are found on the button creation object for the manager.
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(userPin.getBytes());
            //Converter from byte > String for storage.
            finhash = EPOS_Misc_Utils.getHex(hash);
            //Create the user.
            String query = "INSERT INTO Users (UserID, UserPin, UserAdmin, UserForename, UserSur) VALUES (\"" + userID + "\",\"" + finhash + "\"," + userManager + ",\"" + userFN + "\",\"" + userLN + "\")";;
            EPOS_Database_Utilities.manipulateDatabase(con, query);
            JOptionPane.showMessageDialog(null, "User " + userID + " created.");
            return 1;
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Hashing Exception (No Algorithm Found): " + ex);
            return 0;
        }   
    }
    
    public static int updateUser(int oldID, int userID, String userFN, String userLN, int userManager){
        //Defines
        Connection con = EPOS_Database_Utilities.getConnection();
        
        try {
            //Create the user.
            String update = "UPDATE Users SET UserID = \"" + userID + "\", UserAdmin = \"" + userManager + "\", userForename = \"" + userFN + "\", userSur = \"" + userLN + "\" WHERE UserID = \"" + oldID + "\"";
            System.out.println(update);
            EPOS_Database_Utilities.manipulateDatabase(con, update);
            JOptionPane.showMessageDialog(null, "User " + oldID + " updated.");
            return 1;
        } catch (Exception ex) {
            System.out.println("Hashing Exception (No Algorithm Found): " + ex);
            return 0;
        }
    }
    
    public static int deleteUser(int oldID){
        //Defines
        Connection con = EPOS_Database_Utilities.getConnection();
        try {
            String delete = "DELETE FROM Users WHERE UserID = \"" + oldID + "\"";
            //Create the user.
            EPOS_Database_Utilities.manipulateDatabase(con, delete);
            JOptionPane.showMessageDialog(null, "User " + oldID + " Deleted.");
            return 1;
        } catch (HeadlessException ex) {
            System.out.println("Delete User Exception: " + ex);
            return 0;
        }
    }
        
    
}
