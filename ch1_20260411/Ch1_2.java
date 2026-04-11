/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        
        
        String st1 = "Ken";
        String st2 = "Ken";
        String st3 = new String("Ken");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st1 == st2);//== 相等內容一定相等 == 比較變數存放的東西
        System.out.println(st1 == st3);
        System.out.println(st1.equals(st3));//因該要用equals比字串
    }
    
}
