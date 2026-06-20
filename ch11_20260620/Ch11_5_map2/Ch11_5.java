/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_5_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 100);
        map.put("Vivin", 86);
        map.put("Lucy", 77);
        //key存在合併
        map.merge("Vivin", 20, (v1,v2)->{
         
           System.out.println(v1+":"+v2);
            
        return v1 + v2;
        });
          //key不存在 新增資料於map
        System.out.println(map);
        map.merge("Tom", 88, (v1,v2)->{
            
                System.out.println(v1+":"+v2);
            
            return v2;
        });
         System.out.println(map);
    }
    
}
