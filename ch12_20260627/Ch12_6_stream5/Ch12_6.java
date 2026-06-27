/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_6_stream5;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch12_6 {

    static void testLen(String st){
   
        if (st == null ||  st.length() < 3){
            System.out.println("Error");
            return;
        }
        System.out.println(st);
    }
    
    static void testLenOp(Optional<String> op){
                
        if (op.isEmpty() ||  op.get().length() < 3){
            System.out.println("Error");
            return;
        }
        System.out.println(op.get());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Student st = new Student();
        
        
        testLen(st.getName());
        testLenOp(st.getNameOp());
    }
    
}
