/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_5_unaryoperator;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Increment implements UnaryOperator<Integer> {
    private int n = 5;
    
    public Increment(){
        
    }
    
    public Increment(int n){
        this.n = n;
    }
    
    public Integer apply(Integer v){
        return v + n;
    }
}
