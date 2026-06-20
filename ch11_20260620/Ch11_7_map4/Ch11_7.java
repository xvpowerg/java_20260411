/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_7_map4;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch11_7 {

  
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 100);
        map.put("Vivin", 86);
        map.put("Lucy", 77);
        
        //key 存在
        map.compute("Vivin",(key,v2)->{
                System.out.println(key+":"+v2);
        return 25;
        });
        System.out.println(map);
            //key 存在 不執行
        map.computeIfAbsent("Vivin", key->{
            System.out.println("computeIfAbsent:"+key);
        return 99;
        });
         //key 存在執行
        map.computeIfPresent("Lucy", (key,v1)->{
        
            System.out.println("computeIfPresent:"+key+":"+v1);
            return 96;
        });
        System.out.println(map);
        
        //key 不存在
        System.out.println("==========================");
          map.compute("Tom",(key,v2)->{
                System.out.println(key+":"+v2);
        return 25;
        });
        System.out.println(map);
       
         map.computeIfAbsent("Kitty", key->{
            System.out.println("computeIfAbsent:"+key);
        return 99;
        });
         System.out.println(map);
         
         //key 不存在 不執行
        map.computeIfPresent("Joy", (key,v1)->{
        
            System.out.println("computeIfPresent:"+key+":"+v1);
            return 96;
        });
        System.out.println(map); 
         
    }
    
}
