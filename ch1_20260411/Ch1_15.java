/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
            for (int i =1;i<=5;i++){
                
                System.out.print(i+" ");
                if(i == 3) break;
                
            }
            System.out.println();
            for (int i = 1; i<= 5; i++){
                
                if (i==3 || i == 4) continue;
                
                System.out.print(i+" ");
                
            }
            
        
        
    }
    
}
