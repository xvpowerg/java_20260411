/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_5_tostring;

/**
 *
 * @author xvpow
 */
public class Ch6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test1 t1 = new Test1("Hello!",15);
       System.out.println(t1);//也是呼叫toString()
       System.out.println(t1.toString());
    }
    
}
