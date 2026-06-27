/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_10_stream7;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch12_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // TODO code application logic here
     ArrayList<String> list = new ArrayList();
     list.add("Vivin");     
     list.add("Ken");     
     list.add("Iris");
     list.add("Joyce"); 
     list.add("Tom");  
     list.add("Lucy");
     
     list.stream().map(v->v.toUpperCase()).forEach(v->System.out.println(v));
     System.out.println(list);
     list.stream().map(v->v.length()).forEach(v->System.out.println(v));
     System.out.println("===========================");
     
    IntSummaryStatistics iss =  list.stream().
            mapToInt(v->v.length()).summaryStatistics();
    System.out.println(iss.getAverage());
    System.out.println(iss.getMax());
    System.out.println(iss.getSum());
    }
    
}
