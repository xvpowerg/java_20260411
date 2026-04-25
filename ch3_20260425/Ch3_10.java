/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_10 {
//多載 Overloading 會呼叫甚麼方法的規則
//1 一樣類型
//2 相同類型可相容
//3 不同類型可相容
//4 封箱類型
    
//多載 Overloading定義
//函式名稱一樣
//參數類型不一樣
//參數數量不一樣
   
    static float sum(float v1,float v2){
        float ans = v1 + v2;
        return ans;
    }
    
    static int sum(int x1,int x2){
        int ans =  x1 + x2;
        return ans;
    }
    
    public static void main(String[] args) {
        float ans1 = sum(5.2f,3.7f);
        System.out.println(ans1);
        int ans2 = sum(5,10);
         System.out.println(ans2);
    }
    
}
