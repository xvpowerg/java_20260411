/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_5_tostring;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
    private int count;
    Test1(String msg,int count){
        this.msg = msg;
        this.count = count;
    }
    
    public String toString(){
        
        return this.msg+":"+this.count;
    }
    
}
