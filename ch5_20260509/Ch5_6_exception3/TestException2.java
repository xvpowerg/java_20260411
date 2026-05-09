/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_6_exception3;
import java.io.IOException; //是FileNotFoundException父類
import java.io.FileNotFoundException; //是IOException子類
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class TestException2 {
    
    public void test1(boolean b1,boolean b2)throws IOException,SQLException{
        if (b1){
            throw new IOException();
        }else if(b2){
            throw new SQLException();
        }
    }
    
    public void test2(boolean b1,boolean b2){
        
        if (b1){
            throw new IllegalArgumentException();
        }else if(b2){
            throw new NullPointerException();
        }
        
    }
    
}
