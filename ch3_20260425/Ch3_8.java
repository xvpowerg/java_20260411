/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String id = "12345";
       int intId = Integer.parseInt(id);
       System.out.println(id+2);
       System.out.println(intId+2);
       String b1 = Integer.toBinaryString(531);//10轉2進位
       String oc1 = Integer.toOctalString(531);//10轉8進位
       System.out.println(b1);
       System.out.println(oc1);
       Object obj = new Object();
       
       System.out.println(obj.hashCode());
      System.out.println(obj);
       System.out.println(Integer.toHexString(obj.hashCode()));
    }
    
}
