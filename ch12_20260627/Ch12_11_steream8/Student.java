/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20260627.Ch12_11_steream8;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
    private ArrayList<Integer> list = new ArrayList();
    
    void addScore(int v){
        list.add(v);
    }
    Stream<Integer> getScores(){
        return list.stream();
    }
}
