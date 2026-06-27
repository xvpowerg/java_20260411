/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_5_stream4;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch12_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList();
     list.add("Vivin");     
     list.add("Iris");
     list.add("Ken");     
     list.add("Iris");
     list.add("Joyce"); 
     list.add("Joyce");  
     list.add("Tom");  
     list.add("Lucy");  
     
     list.stream().forEach(v->System.out.println(v));
     System.out.println("==================");
     list.stream().distinct().forEach(v->System.out.println(v));
     System.out.println("==================");
     list.stream().dropWhile(v->v.length() > 3).
             forEach(v->System.out.println(v));
      System.out.println("==================");
      list.stream().limit(5).
              forEach(v->System.out.println(v));
       System.out.println("==================");
      list.stream().skip(3).forEach(v->System.out.println(v));
    }
    
}
