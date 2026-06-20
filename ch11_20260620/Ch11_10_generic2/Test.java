/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20260620.Ch11_10_generic2;

/**
 *
 * @author xvpow
 */
public class Test<T extends String> {
    public void setValue(T v){
        System.out.println(v.toLowerCase());
        
    }
}
