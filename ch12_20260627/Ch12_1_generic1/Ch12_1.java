/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_1_generic1;

/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String v1 = TestGeneric.testGen("Hello");
        System.out.println(v1);
        int v2 = TestGeneric.testGen(10);
        System.out.println(v2);
        
       int len =  TestGeneric.map("Vivin", v->v.length());
       System.out.println(len);
        
    }
    
}
