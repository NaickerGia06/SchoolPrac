/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gian
 */
public class DB {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/whogottalent";
    private static final String username = "root";
    private static final String password = "Reddam2021";
    
    private PreparedStatement statement;
    private ResultSet resultSet;
    private Connection conn;
    
    DB(){
        try{
            Class.forName(driver);
        
            conn = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException ex){
            System.out.println("Unable to connect to the database.");
        }catch(ClassNotFoundException ex){
            System.out.println("Unable to load database driver.");
        }
    }
    
    public void update(String update) throws SQLException{
        statement = conn.prepareStatement(update);
        statement.executeUpdate();
        statement.close();
    }
    
    public ResultSet query(String stmt) throws SQLException{
        statement = conn.prepareStatement(stmt);
        resultSet = statement.executeQuery();
        return resultSet;
    }
    
    public String toString(ResultSet rs){
        String temp = "";
        try{
            ResultSetMetaData meta = rs.getMetaData();
            int size = meta.getColumnCount();
            
            while(rs.next()){
                for(int i = 1; i <= size; i++){
                    Object value = rs.getObject(i);
                    temp += "#" + value;
                }
                temp += "\n";
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return temp;
    }
}