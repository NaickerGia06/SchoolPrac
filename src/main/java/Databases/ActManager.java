/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gian
 */
public class ActManager {
   private Act[] actArr = new Act[100];
   private int size = 0;

    public ActManager() throws SQLException {
        DB db = new DB();
        ResultSet rs = db.query("SELECT * FROM tblacts");
        
        while(rs.next()){
            int actNum = rs.getInt(1);
            String actName = rs.getString(2);
            String category = rs.getString(3);
            double sponsorshipAmount = rs.getDouble(4);
            boolean propsNeeded = rs.getBoolean(5);
            
            actArr[size] = new Act(actNum, actName, category, sponsorshipAmount, propsNeeded);
            size++;
        }
    }
    
    public void addAct(int actNum, String actName, String category, double sponsorshipAmount, boolean propsNeeded) throws SQLException{
        actArr[size] = new Act(actNum, actName, category, sponsorshipAmount, propsNeeded);
        size++;
        
        DB db = new DB();
        
        String bool = propsNeeded ? "1" : "0";
        System.out.println("Sir iz not wekking");
        String update = "INSERT INTO tblacts(ActNum, ActName, Category, SponsorshipAmount, PropsNeeded) "
                + "VALUES (" + actNum + ", \"" + actName + "\", \"" + category + "\", " + sponsorshipAmount + ", " + bool + ");";
        System.out.println(update);
        db.update(update);
        
    }
}
