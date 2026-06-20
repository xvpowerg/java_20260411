/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_12_generic4;

/**
 *
 * @author xvpow
 */
public class Ch11_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestGeneric tg = new TestGeneric();
       int v = tg.testGen(10);
       String v2  = tg.testGen("Ken");
       System.out.println(v);
       System.out.println(v2);
       
    }
    
}
