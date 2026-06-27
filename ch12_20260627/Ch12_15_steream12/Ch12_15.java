/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_15_steream12;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
/**
 *
 * @author xvpow
 */
public class Ch12_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Item> list = new ArrayList();

        Item i1 = new Item("A",85);
        Item i2 = new Item("B",72);
        Item i3 = new Item("A",63);
        Item i4 = new Item("B",91);
        Item i5 = new Item("C",61);
        Item i6 = new Item("C",87);
        Item i7 = new Item("B",53);
        
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);
        list.add(i7);
        //System.out.println(list);
       Map<String,List<Item>> groupMap = 
               list.stream().collect(Collectors.groupingBy(it->it.getName()));
        System.out.println(groupMap);
        
        
        Map<String,List<Integer>> groupMap2 = 
               list.stream().collect(Collectors.groupingBy(it->it.getName(),
                       Collectors.mapping(it->it.getValue(),Collectors.toList())));
        System.out.println(groupMap2);
        
      Map<String,Integer> groupMap3 = 
               list.stream().collect(Collectors.groupingBy(it->it.getName(),
                       Collectors.summingInt(it->it.getValue())));
        System.out.println(groupMap3);
        
    }
    
}
