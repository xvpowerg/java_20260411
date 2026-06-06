/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20260606.ch9_10_time;
import java.time.LocalTime;
import java.time.LocalDate;
/**
 *
 * @author xvpow
 */
public class Ch9_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
       System.out.println(LocalDate.now());
       LocalDate date = LocalDate.of(2026, 6, 15);
       System.out.println(date);
    }
    
}
