/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_7_collection6;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch10_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashSet<Item> set = new HashSet();
       Item i1 = new Item("A",25);
       Item i2 = new Item("B",51);
       Item i3 = new Item("C",86);
       Item i4 = new Item("D",18);
       Item i5 = new Item("D",18);
       set.add(i1);
       set.add(i2);
       set.add(i3);
       set.add(i4);
       set.add(i5);
       set.forEach(i->System.out.println(i));
       
       System.out.println(i5.equals(i4));
        System.out.println(i5.equals(i3));
        System.out.println(i5.equals(null));
    }
    
}
