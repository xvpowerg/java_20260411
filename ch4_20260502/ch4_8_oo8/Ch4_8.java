/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20260502.ch4_8_oo8;

/**
 *
 * @author xvpow
 */
public class Ch4_8 {

    
    static void print(TvGame tv){
        tv.printInfo();
    }
    static void print(MyPhone p1){
        p1.printInfo();
    }
    
    public static void main(String[] args) {
       TvGame tv1 = new TvGame("Ps10",65000);
       //tv1.printInfo();
       MyPhone p1 = new MyPhone("iphon100",89000);
       //p1.printInfo();
       
       print(tv1);
       print(p1);
       
    }
    
}
