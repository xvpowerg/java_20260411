/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_9_stream6;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch12_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<String> list = new ArrayList();
     list.add("Vivin");     
     list.add("Ken");     
     list.add("Iris");
     list.add("Joyce"); 
     list.add("Tom");  
     list.add("Lucy");
     
     Optional<String> opt1 =  list.stream().findFirst();
     Optional<String> opt2 = list.stream().parallel().findAny();
     System.out.println(opt1.get());
     System.out.println("findAny:"+opt2.get());
     
     Comparator<String> cmp = Comparator.comparing(v->v);
     Optional<String> max =  list.stream().max(cmp);
     System.out.println(max.get());
     
    }
    
}
