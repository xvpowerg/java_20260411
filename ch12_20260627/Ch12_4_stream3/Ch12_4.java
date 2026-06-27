/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_4_stream3;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> myList=  new ArrayList();
       
        myList.add("Vivin");
        myList.add("Lucy");
        myList.add("Ken");
        myList.add("Iris");
        myList.add("Tom");
        myList.stream().peek(v->System.out.println("Peek:"+v)).
                filter(v->v.length() > 3).forEach(System.out::println);
        
        System.out.println("============================");
        boolean b1 = myList.stream().allMatch(s -> s.length() > 2);//所有都成立
        System.out.println(b1);
        boolean b2 = myList.stream().anyMatch(s->s.length() < 5 );//只要有一個成立
        System.out.println(b2);
        
        boolean b3 = myList.stream().noneMatch(s->s.length() > 10);//所有都不成立
        System.out.println(b3);
                System.out.println("============================");
        //短路 
        //只要一個條件不成立短路
        boolean b4 = myList.stream().peek(v->System.out.println("allMatch Peek:"+v))
                    .allMatch(s->s.length()  > 3);
        System.out.println(b4);
         //只要一個條件成立短路
        boolean b5 = myList.stream().peek(v->System.out.println("anyMatch peek:"+v))
                .anyMatch(s->s.length() < 5);
        System.out.println(b5);
       //只要一個條件成立短路 noneMatch會回傳false
        boolean b6 = myList.stream().peek(v->System.out.println("noneMatch peek:"+v))
                .noneMatch(s->s.length() < 4);
        System.out.println(b6);
    }
    
}
