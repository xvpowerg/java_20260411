/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = new int[2];
        float[] floatArray = new float[2];
        char[]charArray = new char[2];
        boolean[] boolArray = new boolean[2];
        //非基本型態
        String[] stringArray = new String[2];   
        
        int[][] myArray = new int[2][];
        
        System.out.println("intArray:"+intArray[0]);//0
        System.out.println("floatArray:"+floatArray[0]);//0.0
        System.out.println("charArray:"+charArray[0]);//空白字元
        System.out.println("boolArray:"+boolArray[0]);//false
        
        System.out.println("stringArray:"+stringArray[0]);
        System.out.println("myArray:"+myArray[0]);
        System.out.println("myArray:"+myArray[0][0]);//java.lang.NullPointerException
    }
    
}
