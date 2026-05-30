/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_2_consumer;
import java.util.function.Consumer;
public class Download implements Runnable {
    private Consumer<String> callback;
    private String msg = "Finish";
    Download(Consumer<String> callback){
        this.callback = callback;
    }
    public void run(){
        for (int i =1;i<=5;i++){
              System.out.println("Download...:"+i);
              try{
                  Thread.sleep(1000);
              }catch(Exception ex){
                  msg = "Error";
              }  
        }
          callback.accept(msg);
    }
}
