/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_4_function;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch8_4 {

    
    static int stringToInt(String str,Function<String,Integer> func){
        return func.apply(str);
    }
    
    public static void main(String[] args) {
        StringToInt stoi = new StringToInt();
        int v1 = stringToInt("123",stoi);
        System.out.println(v1);
        StringToLen stLen = new StringToLen();
        int len = stringToInt("ABCD",stLen);
        System.out.println(len);
        //len = 4
        
    }
    
}
