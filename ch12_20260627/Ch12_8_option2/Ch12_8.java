/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_8_option2;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch12_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Optional<String> op1 =    Optional.ofNullable(null);
     System.out.println(op1.isPresent());
    Optional<String> op2 =    Optional.ofNullable("Iris");
     System.out.println(op2.isPresent());
     op2.ifPresent(System.out::println);
     op2.ifPresentOrElse(v->System.out.println("Present:"+v),
             ()->System.out.println("Empty"));
    System.out.println("=================");
    Optional<String> op3 =    Optional.ofNullable("Joy");
    String v1 = op3.orElse("Default");
    String v2 = op3.orElseGet(()->"test".toUpperCase());
    String v3 = op3.orElseThrow();
    String v4 = op3.orElseThrow(RuntimeException::new);
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
    System.out.println(v4);
    }
    
}
