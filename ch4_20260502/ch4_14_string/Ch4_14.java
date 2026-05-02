/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20260502.ch4_14_string;

/**
 *
 * @author xvpow
 */
public class Ch4_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st1 = new String("ABCDE");
        String st2 = "CdEfGh";
        String st3 = "CDEFGH";
        System.out.println(st2+":"+st2.toUpperCase());
        System.out.println(st2.equals(st3));
        System.out.println(st2.equalsIgnoreCase(st3));//忽略大小寫比較
    }
    
}
