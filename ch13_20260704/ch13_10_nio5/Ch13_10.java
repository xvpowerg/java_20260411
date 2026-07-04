/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_10_nio5;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch13_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
       Path path = Paths.get("c:","mydir");
       Stream<Path> stPath =  Files.list(path);
       stPath.forEach(p->System.out.println(p));
    }
    
}
