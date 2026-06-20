/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_6_map3;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Ch11_6 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Random ran = new Random();
        HashMap<Integer,Integer> groupMap = new HashMap();
        for (int i =1; i<= 200;i++){
             list.add(ran.nextInt(50)+1);         
        }
        System.out.println(list);
        
//        for (int key : list){
//            int count = 0;
//            if (groupMap.containsKey(key)){
//                count = groupMap.get(key);
//            }
//            count++;
//            groupMap.put(key, count);
//        }
//        System.out.println(groupMap);
        
        for(int key : list){
            groupMap.merge(key, 1,(v1,v2)->{
            
                return v1 + v2;
            } );
        }
       System.out.println(groupMap);
    
        
    }
    
}
