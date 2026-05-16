/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_16_abs1;

/**
 *
 * @author xvpow
 */
public class Dog extends Animal {
    Dog(String name,int age){
        super(name,age);
    }
    
    public String getName(){
        return "Dog:"+super.getName();
    }
}
