/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_7_exception4;

/**
 *
 * @author xvpow
 */
public class Ch5_7_2 {

    static int testFinally(int v){
        System.out.println("Start testFinally");
        
       try{
            if (v > 20){
               System.out.println("testFinally");
               return 100;
           }
       } finally{
           System.out.println("Close");
       }
        
     
        return 300;
    }
    
    public static void main(String[] args) {
        testFinally(10);
        testFinally(50);
    }
    
}
