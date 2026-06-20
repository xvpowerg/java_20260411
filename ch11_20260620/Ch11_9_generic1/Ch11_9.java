/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_9_generic1;

/**
 *
 * @author xvpow
 */
public class Ch11_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.foreach(v->System.out.println(v));
        
        MyList<Integer> myList = new MyList();
        myList.add(10);
        myList.add(60);
        myList.add(25);
        myList.foreach(v->System.out.println(v));
                
        
    }
    
}

