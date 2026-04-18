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
public class Ch2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arra2 = {5,7,9,11,25,31};
        int[] array3 = new int[arra2.length];
        for(int i =0; i< arra2.length;i++){
            array3[i] = arra2[i];
        }
        for (int v : array3){
            System.out.print(v+" ");
        }
        System.out.println();
        //copy如何做
        int[] array4 = Arrays.copyOf(arra2, arra2.length);
        for (int v : array4){
            System.out.print(v+" ");
        }
        System.out.println();
        int[] array5 = Arrays.copyOf(arra2, 3);
        for (int v : array5){
            System.out.print(v+" ");
        }
        
    }
    
}
