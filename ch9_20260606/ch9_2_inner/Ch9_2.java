/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_2_inner;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch9_2 {

    public static void myFilter(ArrayList<Integer> list,Predicate<Integer> p){        
        for (Integer i : list){
            if (p.test(i)){
                System.out.print(i+" ");
            }
        }        
    }
    
    private static class Odd implements Predicate<Integer>{
        public boolean test(Integer i){
            return i % 2 != 0;
        }
    }
    public static void main(String[] args) {
       ArrayList<Integer> myList = new ArrayList<>();
       myList.add(15);
       myList.add(25);
       myList.add(20);
       myList.add(19);
       myList.add(18);
       myList.add(26);
       Odd myOdd = new Odd();
       myFilter(myList,myOdd);
       System.out.println();
       myFilter(myList,new Predicate<Integer>(){
       
            public boolean test(Integer i){
                
                return i % 2 == 0;
            }
       
       
       } );
    }
    
}
