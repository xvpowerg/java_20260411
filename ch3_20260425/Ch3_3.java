/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    //void 表示無回傳
    static void  test1(){
        
        System.out.println("Test1~~");
    } 
    static void test2(int a,int b){
        int ans = a + b;
        System.out.println("ans:"+ans);
    }
    
    static int test3(int a,int b){
        int ans = a * b;
        return ans;//回傳結果給某個變數
    }
    
    static int sum(int[] array){
        int total = 0;
        for (int v : array){
            total += v;
        }
        return total;
    }
    //長參數
    static int sum2(int ... values){
        int total = 0;
        for (int v : values){
            total += v;
        }
        return total;
    }
    //...只能放在最後一個參數
   static String genMsg(String title,String from,String ... txts){
       String msg =title+":"+from;
       for (String v : txts){
           msg += ","+v;
       }
       return msg;
   }
    public static void main(String[] args) {
        test1();
        test2(5,9);
        int x = test3(2,3);
        System.out.println("x:"+x);
        int[] data = {5,6,7,8,9};
        int ans = sum(data);
        System.out.println(ans);
        
        int ans2 = sum2(5,6,7,8,9,11,2,17);
        System.out.println(ans2);
        
        String msg = genMsg("PM","Ken","Hello","Test1");
        System.out.println(msg);
        
    }
    
}
