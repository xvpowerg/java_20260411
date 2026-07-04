/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_5_io5;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch13_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File file = new File("c:\\mydir\\mylist.obj"); 
       try(FileInputStream fin = new FileInputStream(file);
           ObjectInputStream objin = new   ObjectInputStream(fin)  ){
         ArrayList myList = (ArrayList)  objin.readObject();
         System.out.println(myList);
       }catch(IOException | ClassNotFoundException ex){
           System.out.println(ex);
       }
    }
    
}
