/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_2_2_override1;
import ch5_20260509.Ch5_2_override1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3 extends Test1 {
    @Override
    public void testPublic(){
        super.testPublic();
        System.out.println("Test3 testPublic");
    }
    @Override
    protected void testProtected(){
      super.testProtected();//extends 繼承時可呼叫到父類別的內容
      System.out.println("Test3 testProtected:");
    }
    
    //@Override
    void testDefault(){        
         System.out.println("Test3 testDefault");
    }
    //@Override
    private void testPrivate(){
         System.out.println("Test3 testPrivate");
    }
}
