/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_6_nio1;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch13_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path p1 = Paths.get("c:", "mydir","mymsg.txt");
        System.out.println(p1);
        System.out.println(p1.endsWith("mymsg.txt"));
        System.out.println(p1.getFileName());        
        Path p2 = Paths.get("c:","A","B","C","D");
        System.out.println(p2.getParent());
        System.out.println(p2.getNameCount());
        System.out.println(p2.getRoot());
        
        System.out.println(p2.subpath(0, 3));
    }
    
}
