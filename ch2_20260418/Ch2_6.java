/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int array2[] = new int[3];        
        int[] array3 = {5,6,9,1};
        int[] array4 = new int[]{10,25,31,77};
        for (int i = 0; i< array3.length;i++){
            System.out.print(array3[i]+" ");
        }
        System.out.println();
        //foreach
        //array4 
        //10,25,31,77
        for(int v : array4){
            System.out.print(v+" ");
        }
         System.out.println();
         
         
    }
    
}
