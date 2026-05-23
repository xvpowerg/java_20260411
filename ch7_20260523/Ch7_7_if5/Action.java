/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch7_20260523.Ch7_7_if5;

/**
 *
 * @author xvpow
 */
public interface Action {
    void run();
    //會寫default介面方法原因: 我要在default方法呼叫介面抽象方法
    default void runAndPlayAnimator(){
        run();
        System.out.println("Play!");
    } 
}
