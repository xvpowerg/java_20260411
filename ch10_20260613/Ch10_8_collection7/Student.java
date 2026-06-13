/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20260613.Ch10_8_collection7;

/**
 *
 * @author xvpow
 */
public class Student {
    private int number;
    private String name;
    public Student(int number,String name){
        this.name = name;
        this.number = number;
    }
    
    public String toString(){
        return this.name+":"+this.number;
    }
    
    
    public boolean equals(Object obj){
        if (obj == null || obj instanceof Student == false){
            return false;
        }
        Student st = (Student)obj;
        return this.number == st.number &&
                
                this.name.equals(st.name);
    }
}
