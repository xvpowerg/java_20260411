/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20260523.Ch7_10_if8;

/**
 *
 * @author xvpow
 */
//處裡錯誤的方式
//1 只implements 其中一個
//2 default 方法改名稱
//3 在TestObj2 複寫 testDefault 方法
public class TestObj2 implements TestIF1,TestIF2 {
    public void testDefault(){
        System.out.println("TestObj2 testDefault");
    }
}
