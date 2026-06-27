/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_16_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch12_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File f1 = new File("C:\\mydir\\mymsg.txt");
       File target = new File("C:\\mydir\\mymsg_copy.txt");
       System.out.println(f1.exists());
      
     try{
         FileInputStream fin  = new FileInputStream(f1);
         FileOutputStream fout  = new FileOutputStream(target);
         int data = -1;
         
         while( (data = fin.read()) != -1){
         
              fout.write(data);
         
         }
         
     }catch(FileNotFoundException ex){
         System.out.println(ex);
     }catch(IOException ex){
         System.out.println(ex);
     }
       
            
    }
    
}
