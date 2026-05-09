/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_5_exception2;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestException te1 = new TestException();
        try{
            te1.test1(false);
            System.out.println("End");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
            te1.test2(true);
        }catch(RuntimeException ex){
            System.out.println(ex);
        }
        
        
        
    }
    
}
