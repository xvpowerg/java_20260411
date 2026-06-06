/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_1_inner;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    private static class MyCat extends Cat{
        public void bark(){
            System.out.println("Wu Wu");
                    
        }
    }
    
    public static void main(String[] args) {
       Cat cat1 = new Cat();
       cat1.bark();
       Cat cat2 = new MyCat();
       cat2.bark();
       Cat cat3 = new Cat(){
           public void bark(){
               System.out.println("Gigi~");
           }
       };
       cat3.bark();
        
    }
    
}
