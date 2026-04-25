/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425.ch3_14_oo2;

/**
 *
 * @author xvpow
 */
public class Ch3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        //name 長度 必須大於等於2 小於 20
        //不然顯示 name error
        p1.name = "Ken";
        //p1.age = 25;
        p1.setAge(25);
        p1.height = 175.5f;
        p1.printInfo();
        
        Person p2 = new Person();
        p2.name = "Iris";
        p2.height = 165f;
        p2.setAge(980);
        p2.printInfo();
    }
    
}
