/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20260523.Ch7_7_if5;

/**
 *
 * @author xvpow
 */
public class Ch7_7 {

     static void onClick(Action action){
         action.runAndPlayAnimator();
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Action a1 = new MyAction();
        onClick(a1);
    }
    
}
