/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3_20260425.ch3_14_oo2;

/**
 *
 * @author xvpow
 */
public class Person {
        String name;
        private int age;
        float height;
        
        public void setAge(int myAge){
            
            if (myAge < 0 || myAge > 200){
                System.out.println("Age Error:"+myAge);
            
                return;//離開函式
            }
            
            age = myAge;
        }
        public int getAge(){
            return age;
        }
        
        void printInfo(){
            System.out.println(name+":"+ getAge() +":"+height);
        }
        
}
