/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hctim;

import java.awt.HeadlessException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.hsqldb.rights.User;

/**
 *
 * @author 30246059
 */
public class EPOS_Users_Database {
    
    private static int loginSuccess;
    Connection con = EPOS_Database_Utilities.getConnection();
    /**
     * Function: requestLogin
     * Fetches and returns result from the database based on the parameters.
     *
     * @return Returns a boolean if the login is successful..
     * @throws java.security.NoSuchAlgorithmException
     *
     */ 
    public static EPOS_User_Construct requestLogin() throws NoSuchAlgorithmException{
        //Import Class.
        EPOS_User_Construct users = new EPOS_User_Construct();
        //Defines
        JPanel panel = new JPanel();
        String[] options = new String[]{"OK", "Cancel"};
        ArrayList<String> queryUn;
        ArrayList<String> queryPw;
        ArrayList<String> queryAdm;
        ArrayList<String> queryFirst;
        ArrayList<String> queryLast;
        int res = 0;

        //Username:
        JLabel username = new JLabel("Enter your User ID:");
        JTextField uname = new JTextField(24);
        panel.add(username);
        panel.add(uname);
        int optionUserID = JOptionPane.showOptionDialog(null, panel, "Enter your User ID", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        System.out.println(uname.getText());
        String un = uname.getText();
        //Password:
        panel.remove(username);
        panel.remove(uname);
        JLabel passwd = new JLabel("Enter your User Pin:");
        JPasswordField pass = new JPasswordField(24);
        panel.add(passwd);
        panel.add(pass);
        int optionUserPin = JOptionPane.showOptionDialog(null, panel, "Enter your User Pin", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        String pw = String.valueOf(pass.getPassword());
        String query = "SELECT UserID, UserPin, UserAdmin, UserForename, UserSur FROM Users WHERE UserID = \'" + un + "\' LIMIT 1;";
        if (optionUserID == JOptionPane.NO_OPTION || optionUserPin == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "User Authentication Cancelled. Program will terminate.");
            System.exit(0);
        }
        //Query to check credentials.
        try {
            Connection con = EPOS_Database_Utilities.getConnection();
            queryUn = EPOS_Database_Utilities.queryDatabase(con, query, "UserID");
            queryPw = EPOS_Database_Utilities.queryDatabase(con, query, "UserPin");
            queryAdm = EPOS_Database_Utilities.queryDatabase(con, query, "UserAdmin");
            queryFirst = EPOS_Database_Utilities.queryDatabase(con, query, "UserForename");
            queryLast = EPOS_Database_Utilities.queryDatabase(con, query, "UserSur");
            
            //Get the hash of what they typed to compare with the password.
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pw.getBytes());
            //Converter from byte > String for storage.
            pw = EPOS_Misc_Utils.getHex(hash);

            if (queryUn.size() > 0) {
                if (un.equals(queryUn.get(0)) && pw.equals(queryPw.get(0))) {
                    if ("0".equals(queryAdm.get(0))) {
                        res = 1;
                        users.setUserID(Integer.parseInt(un));
                        //users.setUserPin(pw);
                        users.setUserFirstname(queryFirst.get(0));
                        users.setUserLastname(queryLast.get(0));
                        users.setUserRole(0);
                        loginSuccess = 1;
                    } else {
                        res = 2;
                        users.setUserID(Integer.parseInt(un));
                        //users.setUserPin(Integer.parseInt(pw));
                        users.setUserFirstname(queryFirst.get(0));
                        users.setUserLastname(queryLast.get(0));
                        users.setUserRole(1);
                        loginSuccess = 2;
                    }
                } else {
                    JOptionPane optionPane = new JOptionPane("User ID or User Pin incorrect.", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                    requestLogin();
                }
            } else {
                JOptionPane optionPane = new JOptionPane("User ID or User Pin incorrect.", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Failure");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                requestLogin();
            }
        } catch (HeadlessException | SecurityException e) {
            System.out.println("Error with the Login System.");
        }
        return users;
    }
    
    public static int checkSuccess(){
        return loginSuccess;
    }
    
    /**
     * getManagerAuthentication
     * Function to quickly grab manager credentials in order to access the 
     * manager panel.
     * @return 
     * @throws java.security.NoSuchAlgorithmException
     */
    public static int getManagerAuthentication() throws NoSuchAlgorithmException{
        //Defines
        JPanel panel = new JPanel();
        String[] options = new String[]{"OK", "Cancel"};
        ArrayList<String> queryUn;
        ArrayList<String> queryPw;
        ArrayList<String> queryAdm;
        int res = 0;

        //Username:
        JLabel username = new JLabel("Authenticate Manager ID:");
        JTextField uname = new JTextField(24);
        panel.add(username);
        panel.add(uname);
        int managerOption = JOptionPane.showOptionDialog(null, panel, "Manager ID:", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        System.out.println(uname.getText());
        String un = uname.getText();
        //Password:
        panel.remove(username);
        panel.remove(uname);
        JLabel passwd = new JLabel("Authenticate Manager Pin:");
        JPasswordField pass = new JPasswordField(24);
        panel.add(passwd);
        panel.add(pass);
        int managerPin = JOptionPane.showOptionDialog(null, panel, "Manager Pin:", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        String pw = String.valueOf(pass.getPassword());
        String query = "SELECT UserID, UserPin, UserAdmin FROM Users WHERE UserID = \'" + un + "\' LIMIT 1;";
        if(managerPin == JOptionPane.NO_OPTION || managerOption == JOptionPane.NO_OPTION){
            return 1;
        }
        //Query to check credentials.
        try {
            Connection con = EPOS_Database_Utilities.getConnection();
            queryUn = EPOS_Database_Utilities.queryDatabase(con, query, "UserID");
            queryPw = EPOS_Database_Utilities.queryDatabase(con, query, "UserPin");
            queryAdm = EPOS_Database_Utilities.queryDatabase(con, query, "UserAdmin");

            //Get the hash of what they typed to compare with the password.
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pw.getBytes());
            //Converter from byte > String for storage.
            pw = EPOS_Misc_Utils.getHex(hash);
 
            if (queryUn.size() > 0) {
                if (un.equals(queryUn.get(0)) && pw.equals(queryPw.get(0))) {
                    if ("0".equals(queryAdm.get(0))) {
                        res = 1; 
                    } else {
                        res = 2;
                    }
                } else {
                    JOptionPane optionPane = new JOptionPane("Authentication Failed.", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
            } else {
                JOptionPane optionPane = new JOptionPane("Authentication Failed.", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Failure");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
            }
        } catch (HeadlessException | SecurityException e) {
            System.out.println("Error with Management Authentication.");
        }
        return res;
    }
    
    /**
     * Grabs the Total Sales from the Agent using their ID.
     * @param agentID
     * @return 
     */
    public double getUserTotalSales(int agentID){
        String query = "SELECT * FROM Sales WHERE AgentID = " + agentID;
        ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, query, "SalePrice");
        double sum = 0;
        for(int i = 0; i < result.size(); i++){
            sum = sum + Double.parseDouble(result.get(i));
        }
        return sum;
    }
    
    /**
     * Grabs the Highest Sale the user has made via the AgentID
     * @param agentID
     * @return 
     */
     public double getUserHighestSale(int agentID){
        String query = "SELECT * FROM Sales WHERE AgentID = " + agentID;
        ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, query, "SalePrice");
        double highest = 0;
        for(int i = 0; i < result.size(); i++){
            if(Double.parseDouble(result.get(i)) > highest){
                highest = Double.parseDouble(result.get(i));
            }
        }
        return highest;
    }
     
    /**
     * Total Customers Served
     * Grabs the amount of customers served for the current session.
     * @param sessionID
     * @return 
     */
     public int getSessionCustomersServed(int sessionID){
         String query = "SELECT * FROM Sales WHERE SessionID = " + sessionID;
         ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, query, "SalePrice");
         int totalCustomers = result.size();
         return totalCustomers;
     }
     
     /**
      * Session Average Sale
      * Grabs the average sale from the session costs.
     * @param sessionID
     * @return 
      */
     public double getSessionAverageSale(int sessionID){
         String query = "SELECT * FROM Sales WHERE SessionID = " + sessionID;
         ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, query, "SalePrice");
         double sum = 0;
         for(int i = 0; i < result.size(); i++){
             sum = sum + Double.parseDouble(result.get(i));
         }
         double average = sum / result.size();
         return average;
     }
     
     /**
      * Session Minimum Sale
      * Grabs the smallest sale from the session.
     * @param sessionID
     * @return 
      */
     public double getSessionMinSale(int sessionID){
         String query = "SELECT * FROM Sales WHERE SessionID = " + sessionID;
         ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, query, "SalePrice");
         double minimum = Double.parseDouble(result.get(0));
         for (int i = 0; i < result.size(); i++) {
             if(Double.parseDouble(result.get(i)) < minimum){
                 minimum = Double.parseDouble(result.get(i));
             }
         }
         return minimum;
     }
     
     /**
      * Session Maximum Sale
      * Grabs the largest sale from the session.
     * @param sessionID
     * @return 
      */
     public double getSessionMaxSale(int sessionID){
         String query = "SELECT * FROM Sales WHERE SessionID = " + sessionID;
         ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, query, "SalePrice");
         double maximum = 0;
         for (int i = 0; i < result.size(); i++) {
             if(Double.parseDouble(result.get(i)) > maximum){
                 maximum = Double.parseDouble(result.get(i));
             }
         }
         return maximum;
     }
     
     /**
      * Session Total Sale
      * Grabs the total sale from the session.
     * @param sessionID
     * @return 
      */
     public double getSessionTotalSale(int sessionID){
         String query = "SELECT * FROM Sales WHERE SessionID = " + sessionID;
         ArrayList<String> result = EPOS_Database_Utilities.queryDatabase(con, query, "SalePrice");
         double total = 0;
         for (int i = 0; i < result.size(); i++) {
             total = total + Double.parseDouble(result.get(i));
         }
         return total;
     }
}
