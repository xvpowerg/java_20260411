/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_3_modifier_1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public Test1(){
        System.out.println("public Test1()");
    }
    
    protected Test1(String v1){
        System.out.println(" protected Test1(String v1):"+v1);
    }
    
    Test1(int v2){
        System.out.println("default Test1(String v1)");
    }
}
