/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_6_collection5;
import java.util.HashSet;
public class Ch10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //內容不會重複
        //取出的順序 與放入順不一定相同
        //沒有get可用
     HashSet<Integer> set = new HashSet();
     set.add(25);
     set.add(15);
     set.add(31);
     set.add(9);
     set.add(17);
     set.add(9);
     set.add(17);
     for (int v : set){
         System.out.print(v+" ");
     }
     System.out.println();
     set.forEach(v->System.out.print(v+" "));
     System.out.println();
     
     System.out.println(set.contains(17));
     System.out.println(set.contains(11));
    }
    
}
