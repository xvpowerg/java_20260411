/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_7_Inner;

/**
 *
 * @author xvpow
 */
public class InnerClass {
    
    private int count = 0;
    
    InnerClass(){
        
    }
    InnerClass(int count){
        this.count = count;
    }
    public  class MyInner{
        
        private String msg;
        private String name;
        private int age;
        
        MyInner(String msg,String name,int age){
            this.msg = msg;
            this.name = name;
            this.age = age;
        }
        
        
        public void printCount(){
            System.out.println("count:"+count);
        }
        
        public String toString(){
            return this.msg+":"+this.name+":"+this.age;
        }
        
    }
    
    
    public void runTestInner(){
        MyInner t1 = new MyInner("InnerMsg","Iris",18);
        System.out.println(t1);
        
    }
    
    
}
