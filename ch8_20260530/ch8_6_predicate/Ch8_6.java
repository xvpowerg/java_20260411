/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_6_predicate;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch8_6 {

    static void filter(List<Integer> data,Predicate<Integer> p){
        for (int v : data){
            if (p.test(v)){
                System.out.println(v);
            }
            
        }
    }
    public static void main(String[] args) {
      
        ArrayList<Integer> myList = new ArrayList();
        
        myList.add(12);
        myList.add(5);
        myList.add(18);
        myList.add(7);
        myList.add(25);
        OddNumber odd = new OddNumber();
        filter(myList,odd);
    }
    
}
