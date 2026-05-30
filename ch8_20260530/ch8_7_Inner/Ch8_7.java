/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_7_Inner;

/**
 *
 * @author xvpow
 */
public class Ch8_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       InnerClass inner1 = new InnerClass();
       inner1.runTestInner();
       
       
       InnerClass inner2 = new InnerClass();
       InnerClass.MyInner myInner = 
               inner2.new MyInner("Test2","Iris",100);
       System.out.println(myInner);
       
       
       InnerClass inner3 = new InnerClass(25);
       
       InnerClass.MyInner myInner3 = inner3.new MyInner("Test3","Joy",88);
       myInner3.printCount();
       
    }
    
}
