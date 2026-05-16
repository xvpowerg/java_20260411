/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_7_init2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    
    private static int[] array = new int[500];
    //初始化成77
    static{
        //靜態變數初始化 初始化區塊加上static

        for (int i = 0; i < array.length;i++){
            array[i] = 77;
        }
    }
    Test1(){
        
    }
    
    static int getArray(int index){
        return array[index];
    }
    
}
