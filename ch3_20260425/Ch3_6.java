/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //封箱類型
        //基本型態轉物件
        //整數      封箱類型
        //byte      Byte
        //short     Short
        //int       Integer
        //long      Long
        //浮點數
        //float     Float
        //double    Double
        //布林
        //boolean   Boolean
        //字元
        //char      Character
        //手動封箱
        int v1 = 52;
        Integer intObj = Integer.valueOf(v1);
        //手動解封箱
        int v2 = intObj.intValue();
        System.out.println(v2);
        //自動封箱
        Integer intObj2 = 56;
        //自動解封箱
        int v3 = intObj2;
        System.out.println(v3);
        
    }
    
}
