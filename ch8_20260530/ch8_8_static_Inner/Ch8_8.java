/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_8_static_Inner;
import ch8_20260530.ch8_8_static_Inner.InnerClass2.StaticInner;
/**
 *
 * @author xvpow
 */
public class Ch8_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StaticInner st1 = new StaticInner("Iris");
        st1.printCount();
        System.out.println(st1.getName());
        
    }
    
}
