/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_3_oo3;

/**
 *
 * @author xvpow
 */
public class Animal {
        private String name;
        private float height;
        public Animal(){
            
        }
        public Animal(String name,float height){
            this.name = name;
            this.height = height;
        }
        
        public void setName(String name){
            this.name = name;            
        }
        public String getName(){
            return name;
        }
        
        public void setHeight(float height){
            this.height = height;
        }
        public float getHeight(){
            return this.height;
        }
        
        public void printInfo(){
            System.out.println(this.getName()+":"+
                    this.getHeight());
        }
        
}
