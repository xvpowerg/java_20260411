/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_4_modifier_2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private Test1(){
        System.out.println("Test1()");
    }
    
    public static Test1 create(){
        return new Test1();
    }
}
