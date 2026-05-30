/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_3_supplier;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class ExceptionSupplier 
        implements Supplier<StringException>{
    
    public StringException get(){
        return new StringException("String Length Exception");
    }
}
