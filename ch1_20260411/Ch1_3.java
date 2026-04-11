/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        //x++ 分解動作      
        System.out.println(x);
        x = x + 1;
        x = 0;
       //++x 分解動作
        x = x + 1;
        System.out.println(x);
        
        int y = 2;
        System.out.println(y++);
        System.out.println(y);
        
        y = 2;
        System.out.println(++y);
        
        
    }
    
}
