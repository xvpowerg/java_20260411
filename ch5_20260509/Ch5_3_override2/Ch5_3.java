/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_3_override2;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
       int ans =  t1.testInt();
       System.out.println(ans);
       Test1 t1_2 =  t1.newTest1(); 
       System.out.println(t1_2);
    }
    
}
