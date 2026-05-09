/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_6_exception3;
import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch5_6 {


    public static void main(String[] args) {
        TestException2 tex = new TestException2();
        try{
            tex.test1(true, true);
        }catch(IOException ex){
            System.out.println("IOException:"+ex);
        }catch(SQLException ex){
            System.out.println("SQLException:"+ex);
        }
        
        
        try{
            tex.test2(true, true);
        }catch(IllegalArgumentException ex){
            System.out.println(ex);
        }catch(NullPointerException ex){
            System.out.println(ex);
        }
        
    }
    
}
