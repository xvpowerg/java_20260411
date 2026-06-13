/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_1_enum1;

/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPlayer mp1 = new MyPlayer("test1.mp3");
        mp1.action(MyPlayer.MyPlayeAction.PLAY);
       
        mp1.actionEnum(MyPlayer.PlayerAction.PLAY);
        mp1.actionEnum(MyPlayer.PlayerAction.STOP);
        mp1.actionEnum(MyPlayer.PlayerAction.PAUSE);
     
        System.out.println(MyPlayer.PlayerAction.PLAY.name());
        
    }
    
}
