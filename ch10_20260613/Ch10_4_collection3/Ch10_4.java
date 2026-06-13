/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_4_collection3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch10_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(70);
        list.add(30);
        list.add(50);
        list.add(60);
        System.out.println(list);
        int index = list.indexOf(30);
        System.out.println(index);
        index = list.indexOf(95);
        System.out.println(index);
    }
    
}

