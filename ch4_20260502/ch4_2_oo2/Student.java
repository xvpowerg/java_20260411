/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_2_oo2;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    //建構式 沒有回傳值
    //名稱跟類別一樣
    public Student(){
        this("Empty",0);//只能用於建構式 只能是第一個命令
        System.out.println("Student()");
        //this.name = "Empty";
    }
    
    public Student(String name,int age){
        System.out.println("Student(String name,int age)");
        this.name = name;
        this.age = age;
    }
    
    //就近原則
    //this. 當前物件
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
       this.age = age; 
    }
    
    public int getAge(){
        return age;
    }
    
    public void printInfo(){
        System.out.println(getName()+":"+getAge());
    }
}
