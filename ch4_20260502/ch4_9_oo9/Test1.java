/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_9_oo9;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public Test1(){
        this("Test1",20);
        System.out.println("Test1()");
    }
    
    public Test1(String msg){
        System.out.println("Test1(String msg)");
    }
    
    public Test1(String msg,int value){
        this(msg);
        System.out.println("Test1(String msg,int value)");
    }
}
