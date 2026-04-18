/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;

/**
 *
 * @author xvpow
 */
public class Ch2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array3 = {5,6,9,1};//只能用於第一次宣告
        int[] array4 = new int[]{10,25,31,77};
        
        int[] array5 = new int[5];
        for(int v1 : array5){
            System.out.print(v1+" ");
        }
        System.out.println();
        array5 = new int[]{9,10,11,24,68};//宣告過後給予初始值
        for(int v1 : array5){
            System.out.print(v1+" ");
        }
    }
    
}
