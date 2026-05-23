/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch7_20260523.Ch7_10_if8;

/**
 *
 * @author xvpow
 */
//extends 會將default 的方法一併繼承
public interface TestIF3  extends TestIF1,TestIF2{
    default void testDefault(){
        System.out.println("TestIF3 testDefault");
    }
}
