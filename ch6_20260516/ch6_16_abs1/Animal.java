/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_16_abs1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    private String name;
    private int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }    
    public String toString(){
        return this.getName()+":"+this.getAge();
        //return name+":"+age;
    }
}
