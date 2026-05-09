/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_10_override3;

/**
 *
 * @author xvpow
 */
public class Ch5_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1 t1 = new Test2();

       try{
            t1.testException();
       }catch(MainException ex){
           System.out.println(ex);
       }
      
    }
    
}
