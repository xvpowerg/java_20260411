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
public class Ch2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arra2 = {5,7,9,11,25,31};
        int from = 1;
        int to = 4;
        //7 9 11
        int[] arra3 =  new int[to - from];
        for (int i = from; i < to;i++){
              arra3[i - from ] = arra2[i];
        }
        for (int v1 : arra3){
            System.out.print(v1+" ");
        }
          System.out.println();
         int[] arra4 = Arrays.copyOfRange(arra2, 1, 4);
         for(int v1 :arra4 ){
             System.out.print(v1+" ");
         }
        
    }
    
}
