/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_4_function;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class StringToLen implements Function<String,Integer> {
    public Integer apply(String s){
        return s.length();
    }
    
}
