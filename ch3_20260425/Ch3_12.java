/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_12 {
   //多載 Overloading 會呼叫甚麼方法的規則
    //1 一樣類型
    //2 相同類型可相容
    //3 不同類型可相容
    //4 封箱類型    
    
    
    static void test1(int v1,long v2){
        System.out.println("test1 int long");
    }
    static void test1(int v1,int v2){
        System.out.println("test1 int int");
    }
    
    static void test2(float f1,int v2){
        System.out.println("test2 float int");
    }
    static void test2(Integer v1,int v2){
        System.out.println("test2 Integer int");
    }
    static void test3(Integer v1,int v2){
        System.out.println("test3 Integer int");
    }
     static void test3(int  v1,Integer v2){
        System.out.println("test3  int Integer");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //test3(10,52);
        test2(20,18);
        test1(5,6);
    }
    
}
