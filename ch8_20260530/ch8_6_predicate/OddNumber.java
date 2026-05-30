/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_6_predicate;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class OddNumber implements Predicate<Integer> {
    public boolean test(Integer v){
        return v % 2 != 0;
    }
}
