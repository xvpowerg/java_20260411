/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int PLAY = 1;//常數
        final int STOP = 2;
        final int EXIT = 3;
        int action = 9;
                
        switch(action){
             default:
                System.out.println("Error");                
            case PLAY:
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;
            case EXIT:
                System.out.println("Exit");
                break;
           
            
        }
       
        
    }
    
}
