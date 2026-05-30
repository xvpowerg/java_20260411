/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20260530.ch8_3_supplier;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch8_3 {

    static void printLen(String st,
            Supplier<StringException> sp)throws StringException{
        if (st== null || st.length() <= 0  || st.length() > 5){
            throw sp.get();
        }
        System.out.println("Len:"+st.length());

    }
    public static void main(String[] args)throws StringException {
        ExceptionSupplier exs = new ExceptionSupplier();
      printLen("AAA",exs);
      printLen("",exs);
    }
    
}
