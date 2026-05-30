package ch8_20260530.ch8_1_homework;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author xvpow
 */
public class Ch8_1 {

     static void showList(MyIterator it,PrintStyle ps){
        it.foreach(ps);
    }
    public static void main(String[] args) {
       Student st1 = new Student("Ken");
       st1.addScore(85);
       st1.addScore(93);
       st1.addScore(82);
       st1.addScore(74);
       PrintStyle ps1 = new PrintStyleTest1();
       showList(st1,ps1);
       
       
    }
    
}
