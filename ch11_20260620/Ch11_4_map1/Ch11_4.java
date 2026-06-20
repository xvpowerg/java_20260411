/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_4_map1;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Key Value
        //身份證 人
        // DNA  一人的關係
        //地址   一群人
        
        HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 100);
        map.put("Vivin", 86);
        map.put("Lucy", 77);
        map.put("Ken", 98);//key重複 覆蓋於map
        System.out.println(map);
        
        System.out.println(map.get("Ken"));
        for (String key : map.keySet()){
           System.out.println(key+":"+map.get(key));
        }
        System.out.println("=====================");
        map.forEach((k,v)->System.out.println(k+":"+v));
        System.out.println("=====================");
        System.out.println(map.containsKey("Vivin"));
        System.out.println(map.containsKey("Tom"));
        
        int value = 79;
        String key = "Tom";
      //Key存在就不寫入  不存在就寫入
       if (!map.containsKey(key)){
           map.put(key, value);
       }
       System.out.println(map);
       System.out.println("=====================");
       key = "Iris";
       value = 99;
       map.putIfAbsent(key, value);//Key存在就不寫入  不存在就寫入
        System.out.println(map);
    }
    
}

