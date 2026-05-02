/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_4_oo4;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
      //java 沒有任何建構式時 會建立預設建構式
    public Test1(String msg){
        this.msg = msg;
    }
    
    public void printInfo(){
        System.out.println(this.msg);
    }
}
