/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_3_oo3;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal{
    public Cat(){
        
    }
    public Cat(String name,float height){
        super(name,height);
    }
    @Override
    public void printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
}
