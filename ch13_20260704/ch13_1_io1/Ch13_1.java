/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_1_io1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File file = new File("C:\\mydir\\mymsg.txt");
       File outFile = new File("C:\\mydir\\mymsg_copy.txt");
       System.out.println(file.exists());
       
       try{
            FileInputStream fin  = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream(outFile);
            int data = -1;
            while((data = fin.read()) != -1 ){
                fout.write(data);
            }
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
