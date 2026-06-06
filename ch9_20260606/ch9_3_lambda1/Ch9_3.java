/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_3_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    
    static void runAction(TestAction ta){
        ta.action();        
    }
    
    public static void main(String[] args) {
        runAction(new TestAction(){
            public void action(){
                System.out.println("TestAction 1");
            }
        });
        
        runAction(()->{        
            System.out.println("TestAction lambda !");
        });
        
        runAction(()->System.out.println("TestAction lambda2"));
    }
    
}
