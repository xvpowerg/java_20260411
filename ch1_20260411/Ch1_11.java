/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name = "Gigi";//java.lang.NullPointerException 當name是null
       //switch參數可以放byte short int char enum String
       switch(name){
           case "Ken":
               System.out.println("PM");
            break;   
           case "Iris":
               System.out.println("RD");
            break;           
           case "Gigi":
               System.out.println("HR");
            break;
           default:
                System.out.println("Error"); 
              break;
       }
    }
    
}
