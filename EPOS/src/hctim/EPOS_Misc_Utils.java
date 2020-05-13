/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hctim;

/**
 *
 * @author Mitch
 */
public class EPOS_Misc_Utils {
    /**
     * get our HexString from the password hash.
     * @param hash
     * @return 
     */
    public static String getHex(byte[] hash){
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();   
    }
    
}
