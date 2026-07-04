/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_17_db2;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch13_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             String url = "jdbc:derby://localhost:1527/mydb20260704";
        String user = "qwer";
        String password = "12345";
       try( Connection conn = DriverManager.getConnection(url, user, password);
            Statement stm = conn.createStatement();){
           
           ResultSet resSet =  stm.executeQuery("SELECT * FROM STUDENT");
           while(resSet.next()){
               System.out.println(resSet.getInt(1));
               System.out.println(resSet.getString("name"));
               System.out.println(resSet.getDouble(3));
               System.out.println("=====================");
           }
        
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
