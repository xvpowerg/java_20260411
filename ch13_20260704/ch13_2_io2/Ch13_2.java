/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_2_io2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;


import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File file = new File("C:\\mydir\\test_200mb.dat");
       File outFile = new File("C:\\mydir\\test_200mb_copy.dat");
       System.out.println(file.exists());
       
       try{
            FileInputStream fin  = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream(outFile);
            BufferedInputStream bfin = new BufferedInputStream(fin);
            BufferedOutputStream bfout = new BufferedOutputStream(fout);
            int data = -1;
            while((data = bfin.read()) != -1 ){
                bfout.write(data);
            }
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
