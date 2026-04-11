/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int g = 0;
        int ans = 2 + ++g + 1 + g++;
        //        2 +  1  + 1 + 1  
        System.out.println(ans);//5
        System.out.println(g);//2        
    }
    
}
