/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_8_nio3;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch13_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Path p1 =  Paths.get("home",".","mydir");
       System.out.println(p1.normalize());
       Path p2 = Paths.get("home", "..","myfile");
       System.out.println(p2.normalize());
    }
    
}
