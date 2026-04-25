/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {


    public static void main(String[] args) {
        String msg = "ABCDEF";
        int[] arr1 = new int[3];
        System.out.println(arr1.length);//因為陣列的length是常數所以無()
        System.out.println(msg.length());//因為字串的length是方法所以有()
        
        byte[] byteArray = msg.getBytes();
        for (byte b : byteArray){
            System.out.print(b+" ");
        }
        System.out.println();
        
        System.out.println(msg.charAt(0));
        for (int i=0; i <msg.length() ;i++){
            System.out.print(msg.charAt(i)+" ");
        }
          System.out.println();
      
    }
    
}
