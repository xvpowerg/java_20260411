/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 50;
        //且 && 兩邊才為真
        //或 || 單邊為真就是真
        //反向 ! 唱反調
        System.out.println(a < b &&  b < c);
        System.out.println(a > b &&  b < c);
        System.out.println(a > b || b < c);
        System.out.println(a > b || b > c);
        
        System.out.println(!(a > b) );
        
        
        
        
    }
    
}
