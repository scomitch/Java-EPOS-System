/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hctim;

import java.awt.Component;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author 30246059
 */
public class EPOS_Items extends EPOSMain {
    
    //Connection Defines.
    Connection con = EPOS_Database_Utilities.getConnection();
    
    public ArrayList<String> getItems(){
        //Defines for the Itemset.
        ArrayList<String> queryItems;
        String query = "SELECT ItemName FROM Items;";
        queryItems = EPOS_Database_Utilities.queryDatabase(con, query, "ItemName");
        return queryItems;
    }
    
    public ArrayList<String> getPrices(){
        //Defines for the Itemset.
        ArrayList<String> queryPrice;
        String query = "SELECT ItemPrice FROM Items;";
        queryPrice = EPOS_Database_Utilities.queryDatabase(con, query, "ItemPrice");
        return queryPrice;
    }
}
