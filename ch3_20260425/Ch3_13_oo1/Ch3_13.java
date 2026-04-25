/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425.Ch3_13_oo1;

/**
 *
 * @author xvpow
 */
public class Ch3_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new  Student();
       st1.name ="Ken";
       st1.age = 18;
      // System.out.println(st1.name +":"+st1.age);
       
       Student st2 = new Student();
       st2.name = "Vivin";
       st2.age = 23;
       
       Student st3 = new Student();
       st3.name = "Joy";
       st3.age = 25;
       //建一個name joy
       // age 25
       
       st1.printInfo();
       st2.printInfo();
       st3.printInfo();
       //System.out.println(st2.name+":"+st2.age);
    }
    
}
