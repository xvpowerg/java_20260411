/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20260502.ch4_12_override1;

/**
 *
 * @author xvpow
 */
public class Ch4_12 {

    /*
    複寫規則
     1 讀取權限(Modifier)只能公開不能越來越封閉
     2 回傳值如果是基本型態必須一樣 如果是參考型態可以是子類或一樣
     3 方法名稱 參數類型必須一樣
     4 例外拋出 可以不拋出 或拋出一樣 或拋出子類      
    */
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       System.out.println(t1.testPublic);
       System.out.println(t1.testProtected);
       System.out.println(t1.testDefault);
    }
    
}
