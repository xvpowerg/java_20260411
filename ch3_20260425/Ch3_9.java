/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean b1 = true;
        boolean b2 = b1;
        System.out.println(!b2);
        
        int v1 = Integer.parseInt("123");
        System.out.println(v1);
//        int v2 = Integer.parseInt("1 23");//java.lang.NumberFormatException
//        System.out.println(v2);
        boolean b3 = Boolean.parseBoolean("true");
        System.out.println(b3);
        boolean b4 = Boolean.parseBoolean("false");
        System.out.println(b4);
        //只要不是沒空白的true不分大小寫 一律false
        boolean b5 = Boolean.parseBoolean("TrUe");
        System.out.println(b5);
        boolean b6 = Boolean.parseBoolean("AAAAA");
        System.out.println(b6);
    }
    
}
