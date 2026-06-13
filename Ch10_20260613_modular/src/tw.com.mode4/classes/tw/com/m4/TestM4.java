/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m4;
import tw.com.m3.TestM3;
import tw.com.m1.TestM1;
import tw.com.m2.TestM2;
/**
 *
 * @author xvpow
 */
public class TestM4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TestM3 tm3 = new TestM3();
      tm3.showTestM1(new TestM1());
      tm3.showTestM2(new TestM2());
    }
    
}
