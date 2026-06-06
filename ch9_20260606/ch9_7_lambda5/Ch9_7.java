/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_7_lambda5;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch9_7 {
        static String intToString(Integer count){
            String result = "";
              
            char base = 'A';
            for (int i = 0;  i < count; i++){
                result += (char)(base + i % 26);
            }            
            return   result;
        }
    
            
    static void testFunc(int count,Function<Integer,String> func){
        System.out.println(func.apply(count));
    }   
       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Function<Integer,String> fun = v->{
            String result = "";
            char base = 'A';
            for (int i = 0; i < v;i++){
                result += (char)(base + i % 26);
            }            
            return result;       
        };
        
        System.out.println(fun.apply(5));
        testFunc(5,fun);
        //Method references
        testFunc(6,Ch9_7::intToString);
    }
    
}
