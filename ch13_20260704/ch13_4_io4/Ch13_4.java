/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_4_io4;

/**
 *
 * @author xvpow
 */
public class Ch13_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       try(TestAutoClose tc1 = new TestAutoClose("Tc1",true);
       TestAutoClose tc2 = new TestAutoClose("Tc2",true);){
           
            System.out.println(tc1);
            System.out.println(tc2);
           
       }catch(Exception ex){
           System.out.println(ex);
           Throwable[] thr =   ex.getSuppressed();
           for(Throwable th : thr){
               System.out.println("Suppressed:"+th);
           }
       }
      
    }
    
}
