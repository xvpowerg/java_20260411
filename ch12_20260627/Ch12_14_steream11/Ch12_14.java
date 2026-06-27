/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_14_steream11;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
/**
 *
 * @author xvpow
 */
public class Ch12_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Iris");
       
      Map<String,String> map =  list.stream().collect(Collectors.toMap(key->key, 
                                              v->v));
      System.out.println(map);
      
     Map<Integer,String> map2 =  list.stream().collect(Collectors.toMap(key->key.length(), 
                                              v->v,(ov,nv)->{
                                                  System.out.println(ov+":"+nv);
                                                  return ov+":"+nv;
                                              }));
      System.out.println(map2);
    }
    
}
