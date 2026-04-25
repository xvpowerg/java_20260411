/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_4 {

    static void swap(int a ,int b){
        System.out.println("swap:"+a+":"+b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap:"+a+":"+b);
    }
    
    static void swap(int[] array1){
        int tmp = array1[0];
        array1[0] = array1[1];
        array1[1] = tmp;
    }
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+":"+b);
        //call by value
        swap(a,b);//基本型態參數在函式內的修改 不會影響函式外的變數
        System.out.println(a+":"+b);
        
        
        int[] array1 = {99,75};
        System.out.println(array1[0]+":"+array1[1]);
        //非基本型態參數在函式內的修改 可能會影響函式外的變數
        //call by reference
        swap(array1);
        System.out.println(array1[0]+":"+array1[1]);
    }
    
}
