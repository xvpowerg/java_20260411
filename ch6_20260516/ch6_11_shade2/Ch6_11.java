/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_11_shade2;

/**
 *
 * @author xvpow
 */
public class Ch6_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //Shade遮蔽
        //靜態是遮蔽
        //屬性是遮蔽
        //遮蔽 看類別
        //複寫 看物件
        Test1 t1 = new Test2();
        Test2 t2 = new Test2();
        System.out.println(t1.myMsg);
        System.out.println(t2.myMsg);
    }
    
}
