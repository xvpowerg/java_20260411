/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_9_collection8;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch10_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeSet tset = new TreeSet();
       tset.add(8);
       tset.add(3);
       tset.add(16);
       tset.add(5);
       tset.add(13);
       tset.forEach(System.out::println);//預設小到大
       System.out.println("============================");
       System.out.println(tset.first());
       System.out.println(tset.last());
        System.out.println("============================");
       
       System.out.println(tset.ceiling(5));//set 內容是否有剛好>=5的
       System.out.println(tset.higher(5));//set 內容是否有剛好>5的 
       System.out.println("============================");
       System.out.println(tset.floor(8));//set 內容是否有剛好<=8的
       System.out.println(tset.lower(8));//set 內容是否有剛好<8的 
    }
    
}
