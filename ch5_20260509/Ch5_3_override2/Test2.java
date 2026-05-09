/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_3_override2;

/**
 *
 * @author xvpow
 */
//2 回傳值如果是基本型態必須一樣 如果是參考型態可以是子類或一樣

public class Test2  extends Test1{
    public int testInt(){
        System.out.println("Test2 int");
        return 15;
    }
    public Test2 newTest1(){
        System.out.println("Test2 newTest1");
        return new Test2();
    }
}
