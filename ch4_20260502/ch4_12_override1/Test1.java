/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_12_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    //讀取權限(Modifier)只能公開不能越來越封閉
    /*
    public 跨package可讀寫
    protected 跨package不可讀寫 除非
    default跨package不可讀寫
    private 只能在自己的類別讀取
    */
    public String testPublic = "TestPublic";
    protected String testProtected = "TestProtected";
    String  testDefault = "testDefault";
    private String testPrivate = "testPrivate";
    
}
