/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20260523.Ch7_5_if3;

/**
 *
 * @author xvpow
 */
public class Ch7_5 {

    static void testIronMan(IronMan man){
        man.attacking(60);
        man.flying();
        man.runing();
        
    }
    public static void main(String[] args) {
        IronMan man = new IronMan();
        testIronMan(man);
    }
    
}
