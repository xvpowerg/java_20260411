/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20260523.Ch7_5_if3;

/**
 *
 * @author xvpow
 */
public class IronMan implements IronManAction{
    public void attacking(int power){
        System.out.println("IronMan power:"+power);
    }
    public void runing(){
        System.out.println("IronMan runing:");
    }
    public void flying(){
         System.out.println("IronMan flying:");
    }
}
