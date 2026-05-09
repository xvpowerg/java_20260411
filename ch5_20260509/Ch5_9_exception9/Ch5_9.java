/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_9_exception9;

/**
 *
 * @author xvpow
 */
public class Ch5_9 {

    static void testException()throws TestException{
        throw new TestException();
    }
    static void testRuntimeException(){
        throw new TestRuntimeException();
    }
    public static void main(String[] args) {
        try{
            testException();
        }catch(Exception ex){
            System.out.println(ex);
        }
        
       testRuntimeException();
        
        
    }
    
}
