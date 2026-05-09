/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_5_exception2;

/**
 *
 * @author xvpow
 */
//Exception 例外的父類別
//必要例外檢測
public class TestException {
    public void test1(boolean b1)throws Exception{
       if (b1){
           throw new Exception();
       }
    }
    //RuntimeException 例外
    //非必要例外檢測
    public void test2(boolean b2){
        if (b2){
            throw new RuntimeException();
        }
    }
    
}
