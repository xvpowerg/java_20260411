/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_12_steream9;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch12_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
       list.add(2);
       list.add(5);
       list.add(3);
       list.add(9);
       list.add(7);
      Optional<Integer> rop =  list.stream().reduce((v1,v2)->{
           System.out.println(v1+":"+v2);           
          return v1+v2;
       });
      System.out.println(rop.get());
      System.out.println("======================================");
      int v = list.stream().reduce(12, (v1,v2)->{
          System.out.println(v1+":"+v2);
          return v1+v2;
      });
       System.out.println(v);
           System.out.println("======================================");
    int ans =   list.stream().reduce(10, (v1,v2)->{
           System.out.println(v1+":"+v2);
           return v1+v2;
       }, 
         (v1,v2)->{            
             System.out.println("combiner:"+v1+":"+v2);
                return v1+v2;
               });
     System.out.println(ans);
    }
    
}
