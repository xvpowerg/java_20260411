/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_2_collection1;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
       list.add(16);
       list.add(50);
       list.add(6);
       list.add(15);
       list.add(18);
       
       System.out.println(list.get(3));
       for (int i = 0; i < list.size();i++){
           System.out.println(i+":"+list.get(i));
           
       }
       System.out.println("====================================");
       for (int v : list){
           System.out.print(v+" ");
       }
        System.out.println("====================================");
       list.forEach(v->System.out.print(v+" "));
       System.out.println("====================================");
//       String s1 = "";
//       int[] array = null;
//       System.out.println(s1.length());
//       System.out.println(array.length);
//       System.out.println(list.size());
    }
    
}
