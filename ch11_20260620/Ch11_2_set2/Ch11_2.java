/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_2_set2;

import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch11_2 {

    
//    private static class  MyComparator implements Comparator<Product>{
//        public int compare(Product p1,Product p2){
//           int comp = 0;
//           if (p1.getPrice() > p2.getPrice()){
//               return 1;
//           } else if(p1.getPrice() < p2.getPrice()){
//               return -1;
//           }
//           comp =   p1.getName().compareTo(p2.getName());
//           if(comp != 0) return comp;
//            
//            return p1.getLocation().compareTo(p2.getLocation());
//        }
//    }
    
        private static class  MyComparatorReverse implements Comparator<Product>{
        private  int reverse = 1;
        public void reverse(){
            reverse = -1;
        }    
            
        public int compare(Product p1,Product p2){
           int comp = 0;
           if (p1.getPrice() > p2.getPrice()){
              comp = 1;
           } else if(p1.getPrice() < p2.getPrice()){
               comp =  -1;
           }else{
                comp =   p1.getName().compareTo(p2.getName());                
                if (comp  == 0){
                    comp =  p1.getLocation().compareTo(p2.getLocation());
                }                              
           }
            
            return comp * reverse;
        }
    }
    
    
    public static void main(String[] args) {
   MyComparatorReverse cmp = new MyComparatorReverse();
   cmp.reverse();
   //cmp 一般正序 小到大
   //呼叫了cmp.reverse() 變為大到小
    TreeSet<Product> set = new TreeSet(cmp);
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
