/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_9_lambda7;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch9_9 {

   
    public static void main(String[] args) {
        Function<String,Integer>  func1 = String::length;
        System.out.println(func1.apply("ABCD"));
        //傳入一個String 回傳一個TestObject
        Function<String,TestObject> func2 = TestObject::new;
        System.out.println(func2.apply("Lucy"));
        
        
        
    }
    
}
