/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gian
 */
public class DBUserInt {
    public static void main(String[] args) {
        try {
            ActManager am = new ActManager();
            am.addAct(57, "Gia", "Instrumental", 50, true);
        } catch (SQLException ex) {
            Logger.getLogger(DBUserInt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
