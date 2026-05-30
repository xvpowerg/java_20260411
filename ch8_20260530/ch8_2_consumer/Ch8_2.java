/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_2_consumer;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch8_2 {

    
    static void foreach(Consumer<String> style,String ... msg){
        for (String m1 : msg){
            //System.out.println(m1);
            style.accept(m1);
        }
    }
    
    public static void main(String[] args) {
   
        // Consumer<T> accept​(T t)
        //Supplier<T> T get()
        //Function<T,​R> R apply​(T t)轉換
        //UnaryOperator<T> T apply​(T t)
        //Predicate<T> boolean	test​(T t)一元計算
        Consumer<String> ps1 = new PrintStyle();
        foreach(ps1,"A","B","C","D");      
    }
    
}
