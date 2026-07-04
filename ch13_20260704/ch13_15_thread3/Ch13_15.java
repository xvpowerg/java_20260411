/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_15_thread3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author xvpow
 */
public class Ch13_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        for (int i =1; i <= 100;i++){ 
            ex.submit(()->{
            
                    System.out.println(Thread.currentThread().getName());
            
            });
        }
        
        ex.shutdown();
    }
    
}
