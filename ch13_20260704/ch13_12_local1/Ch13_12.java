/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_12_local1;
import java.util.ResourceBundle;
/**
 *
 * @author xvpow
 */
public class Ch13_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ResourceBundle res = ResourceBundle.getBundle("messages");
       System.out.println(res.getString("tw.name"));
       System.out.println(res.getString("tw.welcome"));
    }
    
}
