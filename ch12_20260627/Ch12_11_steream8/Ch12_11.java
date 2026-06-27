/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_11_steream8;

/**
 *
 * @author xvpow
 */
public class Ch12_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student();
      st1.addScore(100);
      st1.addScore(65);
      st1.addScore(89);
      st1.addScore(79);
      
     int sum =  st1.getScores().mapToInt(v->v).sum();
     System.out.println(sum);
    }
    
}
