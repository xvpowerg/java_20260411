/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_5_collection4;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList();
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");
       list.forEach(System.out::println);
     list.addFirst("1");
     list.addLast("2");
     System.out.println(list);
     String v1 = list.pop();
     System.out.println(v1);
     System.out.println(list);
      v1 = list.pop();
      System.out.println(v1);
     System.out.println(list);
     
     String v2 = list.peek();
     System.out.println(v2);
     System.out.println(list);
      v2 = list.peekLast();
      System.out.println(v2);
      System.out.println(list);
    }
    
}
