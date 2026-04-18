/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;

/**
 *
 * @author xvpow
 */
import java.util.Arrays;
public class Ch2_12 {

    public static void main(String[] args) {
        int[] array1 = {11,8,25,9,13};
        Arrays.sort(array1);
        for(int i = 0; i < array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        //大到小顯示
        for (int k =array1.length-1 ;k >= 0 ; k--){
            System.out.print(array1[k]+" ");
        }
         System.out.println();
         int index = Arrays.binarySearch(array1, 9);
         System.out.println(index);
         
         //比所有都小 一律-1
         var index2 = Arrays.binarySearch(array1, 6);
         System.out.println(index2);
         //比所有都大 (len+1)*-1 
         var index3 = Arrays.binarySearch(array1, 100);
          System.out.println(index3);
         //在中間
         var index4 = Arrays.binarySearch(array1, 10);
         System.out.println(index4);
    }
    
}
