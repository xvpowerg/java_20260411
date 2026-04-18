/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array2 = new int[][]{
            {2,5,6,7},
            {8,2,1},
            {9,6},
        };
        System.out.println(array2[0][1]);
        System.out.println(array2[1][2]);
        System.out.println(array2[2][1]);
        //5
        //1
        //6
        
        int[][] array3 = new int[3][];
        array3[0] = new int[]{8,15,20,18};
        array3[2] = new int[]{7,51,33};
        //51
       System.out.println(array3[2][1]); 
        //20
       System.out.println(array3[0][2]);
       System.out.println(array3[1]);
       System.out.println(array3[1][0]);//java.lang.NullPointerException
        
        
    }
    
}
