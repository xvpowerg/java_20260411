/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_2_consumer;

/**
 *
 * @author xvpow
 */
public class Ch8_2_2 {
    
    public static void main(String[] args) {
        CallBack callback = new CallBack();
        Download d1 = new Download(callback);
        d1.run();
    }
    
}
