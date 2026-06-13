/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20260613.Ch10_11_collection10;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch10_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TreeSet<Product> set = new TreeSet();
    Product p1 = new Product("A","AA",10);
    Product p2 = new Product("B","BB",20);
    Product p3 = new Product("C","CC",10);
    Product p4 = new Product("B","GG",20);
    Product p5 = new Product("H","HH",30);
    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);
    set.add(p5);
    System.out.println(set);
    //作業排序順序 金額 Name Location
    
    }
    
}
