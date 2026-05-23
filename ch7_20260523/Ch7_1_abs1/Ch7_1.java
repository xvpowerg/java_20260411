/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20260523.Ch7_1_abs1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee[] empArray = {new HR("Ken",30000),
           new RD("Lucy",50000),
       new HR("Iris",53000)};
       
       for (Employee emp : empArray){
           System.out.println(emp);
       }
    }
    
}
