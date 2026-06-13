/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20260613.Ch10_1_enum1;

/**
 *
 * @author xvpow
 */
public class MyPlayer {
    private String data;
    static interface MyPlayeAction{
        int PLAY =1,STOP=2,PAUSE=3;
    }
    
    public MyPlayer(String data){
        this.data = data;
    }
    public enum PlayerAction{
        PLAY,STOP,PAUSE
    }
    
    public void actionEnum(PlayerAction action){
        switch(action){
            case PLAY:
                 System.out.println("Play!:"+data);
                break;
            case STOP:
                 System.out.println("Stop!:"+data);
                break;    
            case PAUSE:
                System.out.println("Pause!:"+data);
                break;      
        }
    }
    
    
    public void action(int action){
        
        switch(action){
            case MyPlayeAction.PLAY:
                System.out.println("Play!:"+data);
                break;
            case MyPlayeAction.STOP:
                System.out.println("Stop!:"+data);
                break;
            case MyPlayeAction.PAUSE:
                System.out.println("Pause!:"+data);
                break;
        }        
    }
}
