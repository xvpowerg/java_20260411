/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20260418;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] myArray = new int[2][3];
        myArray[0][1] = 18;
        myArray[1][1] = 17;
        myArray[1][2] = 20;
        
        for (int i = 0; i< 2; i++){        
            for (int k = 0; k < 3; k++){               
                  System.out.print(myArray[i][k]+" ");                
            }   
            System.out.println();
            
        }
        
        System.out.println();
           //foreach
        for(int[] v1 : myArray){                
            for (int v2 : v1){
                System.out.print(v2+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int[] v1 : myArray){
            
            for (int v2:v1){
                if (v2 % 2 == 0){
                   System.out.print(v2+" ");
                }else{
                    System.out.print("  ");
                }                
            }
            System.out.println();
            
        }
        
    }
    
}
