/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_18_db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch13_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20260704";
        String user = "qwer";
        String password = "12345";
        //交易
       try( Connection conn = DriverManager.getConnection(url, user, password);){
           conn.setAutoCommit(false);
           try(Statement stm = conn.createStatement();){
                stm.executeUpdate("INSERT INTO student(id,name,score) VALUES(10002,'A',88.3)");
                stm.executeUpdate("INSERT INTO student(id,name,score) VALUES(10003,'B',88.3)");
                stm.executeUpdate("INSERT INTO student(id,name,score) VALUES(10006,'C',88.3)");               
           }
           
          conn.commit();
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
