/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_14_thread2;

/**
 *
 * @author xvpow
 */
public class Ch13_14 {
    static class Test1{
        int price = 10;
        
        synchronized void  myRun(){
              for (int i = 1; i <= 10; i++){
                   System.out.println(Thread.currentThread().getName()+":"+price);
                   price++;
             }
        }
        
    }
    
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Thread th1 = new Thread(()->{
         t1.myRun();        
        });
        
        Thread th2 = new Thread(()->{
          t1.myRun();        
        });
        
       th1.start();
       th2.start();
      
    }
    
}
