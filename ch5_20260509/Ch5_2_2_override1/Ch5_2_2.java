/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_2_2_override1;
import ch5_20260509.Ch5_2_override1.Test1;
/**
 *
 * @author xvpow
 */
public class Ch5_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1 t1 = new Test3();
       t1.testPublic();
       System.out.println("=================");
       Test3 t3 = new Test3();
       t3.testPublic();
       t3.testProtected();
       t3.testDefault();
    }
    
}
