/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20260523.Ch7_13_if11;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch7_13 {

    static void foreach(ArrayList<String> list,PrintStyle ps){
        for (String s : list){
            ps.myStyle(s);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");
        PrintStyle ps1 = new MyPrintStyle1();
        foreach(data,ps1);
        PrintStyle ps2 = new MyPrintStyle2();
        foreach(data,ps2);
    }
    
}
