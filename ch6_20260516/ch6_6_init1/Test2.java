/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_6_init1;

/**
 *
 * @author xvpow
 */
public class Test2 {
    private int[] array = new int[500];
    
    {
    
        for(int i = 0; i < array.length;i++){
            array[i] = 100;
        }
    
    }
    Test2(){
        
    }
     Test2(String st1){
        
    }
    public  int getArrayValue(int index){
        return array[index];
    }
    
    
}
