/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_4_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    static void runTestFunc2(String msg,TestFunc2 myFunc){
        myFunc.func(msg);
    }
    public static void main(String[] args) {
       runTestFunc2("Error!",(String msg)->{
       
       System.out.println(msg.toUpperCase());
       });
       
       runTestFunc2("Debug!",(msg)->System.out.println(msg.toLowerCase()));
       runTestFunc2("Info",msg->System.out.println(msg.concat("!!!!")));
    }
    
}
