/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_2_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
        /*
    複寫規則
     1 讀取權限(Modifier)只能公開不能越來越封閉
     2 回傳值如果是基本型態必須一樣 如果是參考型態可以是子類或一樣
     3 方法名稱 參數類型必須一樣
     4 例外拋出 可以不拋出 或拋出一樣 或拋出子類      
    */
    public void testPublic(){
        System.out.println("Test1 testPublic");
    }
    protected void testProtected(){
        System.out.println("Test1 testProtected");
    }
    void testDefault(){
        System.out.println("Test1 testDefault");
    }
    private void testPrivate(){
        System.out.println("Test1 testPrivate");
    }
}
