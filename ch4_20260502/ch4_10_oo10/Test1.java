/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_10_oo10;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this("msg",20);
        System.out.println("Test1()");
    }
    
    Test1(String m,int v){
        this(m);
        System.out.println("Test1(String m,int v)");
    }
     Test1(String m){
         System.out.println("Test1(String m)");
     }
}
