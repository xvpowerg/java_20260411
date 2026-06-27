/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_2_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> myList=  new ArrayList();
        myList.add("Ken");
        myList.add("Vivin");
        myList.add("Lucy");
        myList.add("Iris");
        myList.add("Tom");
        
        for (int i =0; i< myList.size();i++){
            if (myList.get(i).length() == 3){
                System.out.println(myList.get(i));
            }
        }
        
        myList.forEach(v->{
            if (v.length() == 3){
                System.out.println(v);
            }
        
        });
        
        myList.stream().filter(v->v.length() == 3).forEach(System.out::println);
        
        
    }
    
}
