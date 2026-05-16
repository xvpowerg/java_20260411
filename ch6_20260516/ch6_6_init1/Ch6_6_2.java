/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_6_init1;

/**
 *
 * @author xvpow
 */
public class Ch6_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        System.out.println(t2.getArrayValue(5));
        System.out.println(t2.getArrayValue(25));
        
        Test2 t3 = new Test2("Iris");   
        System.out.println(t3.getArrayValue(5));
        System.out.println(t3.getArrayValue(25)); 
        

    }
    
}
