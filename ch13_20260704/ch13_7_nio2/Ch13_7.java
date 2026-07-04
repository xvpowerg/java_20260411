/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_7_nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author xvpow
 */
public class Ch13_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("c:", "mdir");
        Path p2 = Paths.get("myFile.txt");
        Path p3 = p1.resolve(p2);
        System.out.println(p3);
        
    }

}
