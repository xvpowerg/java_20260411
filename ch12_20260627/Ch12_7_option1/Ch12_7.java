/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_7_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch12_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Optional<String>op1 =  Optional.of("Ken");
        System.out.println(op1.get());
            //不支持null
        //Optional<String>op2 =  Optional.of(null);
         Optional<String> empty = Optional.empty();
         System.out.println(empty.isEmpty());
         if (empty.isPresent()){
             System.out.println(empty.get());
         }
         
    }
    
}
