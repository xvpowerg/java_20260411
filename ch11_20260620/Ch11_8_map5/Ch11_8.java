/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_8_map5;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch11_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comparator<Item> cmp =  Comparator.comparing(it->it.getPrice());
        cmp = cmp.thenComparing(it->it.getName());
        TreeMap<Integer,String> treeMap = new TreeMap();
        treeMap.put(8,"Ken");
        treeMap.put(2,"Iris");
        treeMap.put(5,"Vivin");
        treeMap.put(3,"Lucy");
        System.out.println(treeMap);
        
         TreeMap<Item,String> treeMpa2 = new TreeMap(cmp);   
         Item it1 = new Item(10,"A");
         Item it2 = new Item(6,"B");
         Item it3 = new Item(8,"C");
         Item it4 = new Item(4,"D");
         Item it5 = new Item(2,"E");
         Item it6 = new Item(6,"F");
         
         treeMpa2.put(it1, it1.getName());
         treeMpa2.put(it2, it2.getName());
         treeMpa2.put(it3, it3.getName());
         treeMpa2.put(it4, it4.getName());
         treeMpa2.put(it5, it5.getName());
         treeMpa2.put(it6, it6.getName());
         System.out.println(treeMpa2);
        
    }
    
}
