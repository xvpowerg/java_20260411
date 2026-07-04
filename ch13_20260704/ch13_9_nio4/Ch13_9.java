/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_9_nio4;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author xvpow
 */
public class Ch13_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("c:","mydir","test_200mb.dat");
        Path p2 = Paths.get("c:","mydir","test_200mb_copy.dat");
        try{
            Files.copy(p1, p2,StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception ex){
            System.out.println(ex);
        }
       
    }
    
}
