/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_8_lambda6;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch9_8 {

    static void testConsumer(String msg,Consumer<String> com){
        com.accept(msg);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TestClass tc = new TestClass(3);
        tc.runMethod("A");
        
        testConsumer("B",tc::showString);
        testConsumer("C",tc::showString);
    }
    
}
