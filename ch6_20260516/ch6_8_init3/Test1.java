/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_8_init3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    
    Test1(){
        System.out.println("Test1()");
    }
    
    {
        System.out.println("Test1 init(1)");
    }
    
    
    static{
        System.out.println("Test1 static init(1)");
    }
    
    {
        System.out.println("Test1 init(2)");
    }
    
    static{
        System.out.println("Test1 static init(2)");    
    }
    
}
