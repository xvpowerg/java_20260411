/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (int i =1; i<=3;i++){
//            
//            for (int k = 1; k<=2;k++){
//                System.out.print(i+":"+k+" ");
//                
//                if (i == 2){
//                    break;
//                }
//            }
//            System.out.println();
//            
//        }

      for (int i =1; i<=3;i++){            
            for (int k = 1; k<=2;k++){
                 if (i == 2){
                    continue;
                }
                System.out.print(i+":"+k+" ");                
              
            }
            System.out.println();            
        }
    }
    
}
