/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_2_consumer;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class PrintStyle implements Consumer<String> {
    public void accept(String st1){        
        System.out.print(st1+" ");
    }
    
}
