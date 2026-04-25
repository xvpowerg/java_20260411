/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-128~127做了快取所以在這範圍==為true
       Integer v1 = 127;
       Integer v2 = 127;
       
       System.out.println(v1 == v2);
       
       Integer v3 = 562;
       Integer v4 = 562;
       System.out.println(v3 == v4);
       
    }
    
}
