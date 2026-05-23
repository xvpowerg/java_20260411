/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20260523.Ch7_2_resport;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private ArrayList<Integer> scores = new ArrayList();
    Employee(String name){
        this.name = name;
    }
    
    public void appendScore(int s){
        scores.add(s);
    }
    public String toString(){
        return this.name+":"+this.scores;
    }
}
