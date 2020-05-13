/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hctim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 30246059
 */
public class EPOS_Database_Utilities {
    
    /*  
        Database Used: Microsoft Access
        JDBC: UCanAccess-4.0.2
    */
    
    //Defines
    private static final String LOCATION = "jdbc:ucanaccess://data\\Database.accdb";
    private static Connection con; 
    
    /**
     * Function: getConnection
     * Establishes a connection between the program and the db.
     *
     * @return Returns the connection string
     *
     */
    public static Connection getConnection(){
            try {
                con = DriverManager.getConnection(LOCATION);
            } catch (SQLException e) {
                handleError(e);
                return null;
            }
            return con;     
    }
        
    /**
     * Function: queryDatabase
     * Fetches and returns result from the database based on the parameters.
     *
     * @param con - Passed connection string from getConnection.
     * @param query - User-generated SQL Query for the database.
     * @param table - The table which is to be queried.
     * @return Returns the query result-set in an ArrayList to be parsed later.
     *
     */
    public static ArrayList<String> queryDatabase(Connection con, String query, String table){
        ArrayList<String> resultList = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                resultList.add(result.getString(table));
            }
            
        } catch (SQLException e) {
            handleError(e);
            return null;
        }
        return resultList;
    }
    
    /**
     * Function: manipulateDatabase
     * Parses and manipulates the database for data-entry
     *
     * @param con - Passed connection string from getConnection.
     * @param query - User-generated SQL Query for the database.
     *
     */
    public static void manipulateDatabase(Connection con, String query){
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            handleError(e);
        }
    }
    
    /**
     * Function: handleError
     * Handles any database errors and parses it to the user for troubleshooting
     *
     * @param error - Parsed Error.
     *
     */
    public static void handleError(SQLException error){
        System.out.println("Error connecting to the Database.");
        System.out.println("Please contact an Administrator.");
        System.out.println("Error Code: " + error);
    }
}
