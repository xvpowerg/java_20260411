/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_6_lambda4;
import java.util.function.BiFunction;
/**
 *
 * @author xvpow
 */
public class Ch9_6 {

    static void testBiFunction(int v1,String v2,BiFunction<Integer,String,String> bifunc){
        String result = bifunc.apply(v1, v2);        
        System.out.println(result);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        testBiFunction(2,"ABCDE",(Integer v1,String v2)->{
            return v2.substring(v1);
        });
        
        testBiFunction(6,"A",(v1,v2)->{
            String result = "";
            for (int i = 1; i <= v1;i++){
                result += "A";
            }
            return result;
        });
        
    }
    
}
