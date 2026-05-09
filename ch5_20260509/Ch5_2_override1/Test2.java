/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_2_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    // 1 讀取權限(Modifier)只能公開不能越來越封閉
    public void testPublic(){
        System.out.println("Test2 testPublic");
    }
    protected void testProtected(){
        System.out.println("Test2 testProtected");
    }
    void testDefault(){
        System.out.println("Test2 testDefault");
    }
    //@Override
    private void testPrivate(){
          System.out.println("Test2 testPrivate");
    }
}
