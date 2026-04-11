/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java20260411;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b1 = 10;//-128~127
        short s2 = 25;//-32768~32767
        int i3 = 860;//-2147483648~2147483647
        long longv = 2147483648L;
        System.out.println(b1);
        System.out.println(s2);
        System.out.println(i3);
        System.out.println(longv);
        float f1 = 5.8f;//預設是double
        double d1 = 2.71828;
        System.out.println(f1);
        System.out.println(d1);
        
        char c1 = 'G';//0~65535
        System.out.println(c1);
        c1 = 65;
        System.out.println(c1);
        
        boolean bool = false;
        System.out.println(bool);
                
        String msg = "ABCDE";
        System.out.println(msg);
                
    }
    
}
