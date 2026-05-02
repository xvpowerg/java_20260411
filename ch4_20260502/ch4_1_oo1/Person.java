/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_1_oo1;

public class Person {
        private String name;
        private int age;
        float height;
        
        public void setName(String myName){            
            if (myName == null || myName.length()< 2 || myName.length() > 20 ){
                System.out.println("Name Error");
                return;
            }
            name = myName;            
        }
        public String getName(){
            return name;
        }
        public void setAge(int myAge){
            age = myAge;
        }
        
        public int getAge(){
            return age;
        }
        
        public void printInfo(){
            System.out.println(getName()+":"+getAge());
        }
        
}
