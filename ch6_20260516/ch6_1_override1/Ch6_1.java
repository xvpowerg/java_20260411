/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_1_override1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        try{
           t1.runMyException(); 
        }catch(TestException ex){
            System.out.println(ex);
        }
        //無需求做try catch
        t1.runMyRuntimeException();
        
    }
    
}
