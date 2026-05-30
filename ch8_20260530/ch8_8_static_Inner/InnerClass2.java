/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_8_static_Inner;

/**
 *
 * @author xvpow
 */
public class InnerClass2 {
    private static int count =25;
    static class StaticInner{
        private String name;
        StaticInner(String name){
            this.name = name;
        }
        
        public String getName(){
            return this.name;
        }
        public void printCount(){
            System.out.println(count);
        }
        
    }
    
    public void testClass(){
        StaticInner st1 = new StaticInner("Ken");
    }
}
