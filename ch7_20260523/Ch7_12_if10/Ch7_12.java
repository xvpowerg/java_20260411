/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20260523.Ch7_12_if10;

/**
 *
 * @author xvpow
 */
public class Ch7_12 {

    static void testRun(FunctionIF fun){
        fun.run();
    }
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        testRun(myRun);
    }
    
}
