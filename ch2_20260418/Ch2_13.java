/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array1 = new int[500];
       System.out.println(array1[8]);
       //希望預設改成-1
       for (int i =0; i < array1.length;i++){
           array1[i] = -1;
       }
       System.out.println(array1[9]);
       
       String[] str1 = new String[10];
        Arrays.fill(str1, "");
       if (str1[0].isEmpty()){
            System.out.println("Is Empty");
        }else{
            System.out.println(str1[0]);
        }
       
       
       
        
    }
    
}
