/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//JDBC
package ch13_20260704.ch13_16_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch13_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20260704";
        String user = "qwer";
        String password = "12345";
       try( Connection conn = DriverManager.getConnection(url, user, password);
            Statement stm = conn.createStatement();){
           
         int count =  
                 stm.executeUpdate("INSERT INTO student(id,name,score) VALUES(101,'Lucy',88.3)");
         System.out.println(count);
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}