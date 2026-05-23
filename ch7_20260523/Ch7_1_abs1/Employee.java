/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20260523.Ch7_1_abs1;

/**
 *
 * @author xvpow
 */
public abstract class Employee {
    private String name;
    private int salary;
    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    //有抽象方法一定是抽象類
    public abstract int getPay();
    public int getSalary(){
        return salary+getPay();
    }
    public String getName(){
        return name;
    }
    
    public String toString(){
        return this.getName()+":"+this.getSalary();
    }
    
}
