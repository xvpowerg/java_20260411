/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_6_init1;

/**
 *
 * @author xvpow
 */
public class Ch6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Test1 t1 = new Test1();
      System.out.println(t1.getArrayValue(5));
      System.out.println(t1.getArrayValue(10));
      Test1 t2 = new Test1("Ken");
      System.out.println(t2.getArrayValue(5));
      System.out.println(t2.getArrayValue(10));
      
    }
    
}
