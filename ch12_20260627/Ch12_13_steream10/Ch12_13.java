/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_13_steream10;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch12_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Iris");
       
       List<String> myList =  
               list.stream().filter(v->v.length() > 3).collect(Collectors.toList());
       System.out.println(myList);
        System.out.println(list);
        
        
      ArrayList<String> myList2 =  
               list.stream().filter(v->v.length() > 3).collect(Collectors.
                       toCollection(()->new ArrayList<String>()));
       System.out.println(myList2);
      
       
      String msg =  list.stream().collect(Collectors.joining(",","Title:", "."));
      System.out.println(msg);
       
       
    }
    
}
