/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_9_static2;

/**
 *
 * @author xvpow
 */
public class Ch6_9 {

    /**
     * @param args the command line arguments
     */
    
    void test1(){
        System.out.println("test1");
    }
    static void test2(){
        System.out.println("static test2");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //static的函式無法呼叫非static的函式
        //test1();//因為test1 不是static的
        test2();
        Ch6_9 c69 = new Ch6_9();
        c69.test1();
    }
    
}
