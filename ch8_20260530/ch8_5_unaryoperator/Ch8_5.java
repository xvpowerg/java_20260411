/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_5_unaryoperator;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch8_5 {
    
    static void increment(int[] array,UnaryOperator<Integer> uop){
        for (int i = 0; i < array.length;i++){
            array[i] = uop.apply(array[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Increment inc = new Increment(8);
        increment(array,inc);
        for (int v : array){
            System.out.print(v+" ");
        }
        
    }
    
}
