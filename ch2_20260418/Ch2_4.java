/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;

/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = new int[10];
        array1[0] = 7;
        int i = 2;
        array1[i] = 5;
        i+=2;
        array1[i] = 18;
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        array1[8] = 77;
       System.out.println("==============================");
   
       for (int k = 0; k <array1.length;k++){
           System.out.print(array1[k]+" ");
       }
       System.out.println();
       
       for (int x = 0; x < array1.length;x++){
           int v = array1[x];
           System.out.print(x+":"+v+" ");
       }
        System.out.println();
      //foreach
      for (int v : array1){
          System.out.print(v+" ");
      }
      System.out.println();
        
    }
    
}
