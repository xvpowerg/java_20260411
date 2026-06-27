/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20260627.Ch12_1_generic1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class TestGeneric {
    public static <T> T testGen(T v){
        return v;
    }
    
    public static <T,R> R map(T data,Function<T,R> fun){
        return fun.apply(data);
    }
}
