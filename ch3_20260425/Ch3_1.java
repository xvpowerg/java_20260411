/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
     /*輸出如下
       7   8   9
        12  13  14
        17  18  19*/
           for(int i =1;i<4;i++){
               for (int k =1 ; k < 4;k++){
                   
                   //System.out.print(arr[i][k]+" ");
                   System.out.print(arr[i][k]+(arr[i][k] < 10?"  ":" "));
                   
               }
               System.out.println();
           }
     
     
    }
    
}
