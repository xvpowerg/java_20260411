/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_11 {

    //多載 Overloading 會呼叫甚麼方法的規則
//1 一樣類型
//2 相同類型可相容
//3 不同類型可相容
//4 封箱類型
    
//多載 Overloading定義
//函式名稱一樣
//參數類型不一樣
//參數數量不一樣
    
    static void test1(int v1){
        System.out.println("int v1");
    }
    static void test1(float f2){
        System.out.println("float f2");
    }
    
    static void test2(long v1){
        System.out.println("test2 long v1");
    }
    static void test2(float f2){
        System.out.println("test2 float f2");
    }
    
    static void test3(byte b1){
        System.out.println("test3 byte b1");
    }
    static void test3(float f1){
        System.out.println("test3 float f1");
    }
    static void test4(float f1){
        System.out.println("test4 float f1");
    }
    static void test4(Integer v2){
        System.out.println("test4 Integer v2");
    }
    
    static void test5(short s1){
        System.out.println("test5 short");
    }
    static void test5(Integer v2){
        System.out.println("test5 Integer v2");
    }
    public static void main(String[] args) {
        test5(1);
        test4(9);
        
        //預設情況下是int因為byte無法相容int所以呼叫float        
        test3(2);
        
        int v1 = 25;
        test2(v1);//相同類型可相容
        
        test1(10);
        test1(2.5f);
        
        
      
    }
    
}
