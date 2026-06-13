/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_8_collection7;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student(10,"A1");
       Student st2 = new Student(12,"A2");
       Student st3 = new Student(13,"A3");
       Student st4 = new Student(14,"A4");
       Student st5 = new Student(15,"A5");
       
       Student search = new Student(13,"A3");
       ArrayList<Student> stList = new ArrayList();
       stList.add(st1);
       stList.add(st2);
       stList.add(st3);
       stList.add(st4);
       stList.add(st5);
       System.out.println(stList);
       int index = stList.indexOf(search);
       System.out.println(search+":"+index);
       stList.remove(search);
       System.out.println(stList);
    }
    
}
