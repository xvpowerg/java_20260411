/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_3_collection2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList();
        myList.add(10);
        myList.add(25);
        myList.add(18);
        myList.add(31);
        System.out.println(myList);
        myList.add(2,77);
        System.out.println(myList);
        ArrayList<Integer>data = new ArrayList();
        data.add(560);
        data.add(780);
        data.add(650);
        myList.addAll(data);
        System.out.println(myList);
        myList.remove(Integer.valueOf(18));
         System.out.println(myList);
         ArrayList<Integer> del = new ArrayList<>();
         del.add(360);
         del.add(650);
         del.add(31);
         myList.removeAll(del);
         System.out.println(myList);
         myList.removeIf(v->v % 2 == 1);
         System.out.println(myList);
        myList.replaceAll(v->v * 2);
         System.out.println(myList);
         myList.replaceAll(v->{
             return v % 3 == 0? v + 2: v;
         });
         System.out.println(myList);
                 
         myList.set(1, 19);
         System.out.println(myList);
    }
    
}
