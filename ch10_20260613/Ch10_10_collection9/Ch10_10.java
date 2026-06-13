/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_10_collection9;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch10_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Ken",95);
       Student st2 = new Student("Vivin",72);
       Student st3 = new Student("Lucy",63);
       Student st4 = new Student("Iris",78);
       Student st5 = new Student("Lindy",45);
       Student st6 = new Student("Joy",72);
       Student st7 = new Student("Sean",45);
       TreeSet<Student> treeSet = new TreeSet();
       treeSet.add(st1);
       treeSet.add(st2);
       treeSet.add(st3);
       treeSet.add(st4);
       treeSet.add(st5);
       treeSet.add(st6);
       treeSet.add(st7);
       System.out.println(treeSet);
    }
    
}
