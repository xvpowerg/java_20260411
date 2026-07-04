/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20260704.ch13_5_io5;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> myList = new ArrayList();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Joy");
       File file = new File("c:\\mydir\\mylist.obj");
       try(
           FileOutputStream fout = new FileOutputStream(file);
           ObjectOutputStream objout = new ObjectOutputStream(fout)){
           objout.writeObject(myList);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
