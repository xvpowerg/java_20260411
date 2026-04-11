/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 50;
      System.out.println("======================");
      //左至右執行 中斷了不繼續往右 就短路
      int i = 0;
      boolean b1 = a > b && ++i < c;//左邊fasle就短路
      System.out.println(i);
      System.out.println(b1);
      i = 0;
      boolean b2 = a < b || ++i < c;//左邊true就短路
      System.out.println(i);
      System.out.println(b2);
      
    }
    
}
