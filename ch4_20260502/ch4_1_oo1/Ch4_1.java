/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20260502.ch4_1_oo1;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person();
       p1.setName("Ken");
       p1.setAge(25);
       p1.printInfo();
       
      Person p2 = new Person();
      p2.setAge(15);
      p2.setName(null);
    }
    
}
