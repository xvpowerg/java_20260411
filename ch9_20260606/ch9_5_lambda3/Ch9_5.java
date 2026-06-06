/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_5_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch9_5 {

    static int runTestFunc3(String v1,TestFunc3 func3){
        
        return func3.func(v1);
    }
    public static void main(String[] args) {
    int len = runTestFunc3("ABCDE",(String v1)->{               
            return v1.length();            
        });   
        System.out.println(len);
        
     int number =    runTestFunc3("123456",v1->Integer.parseInt(v1));
     
     System.out.println(number);
    }
    
    
}
