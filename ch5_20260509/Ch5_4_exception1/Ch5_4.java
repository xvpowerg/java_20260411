/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_4_exception1;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student st1 = new Student();
        st1.setName("Ken");
        st1.setAge(900);//< 0 > 200 顯示Age Error
        st1.printInfo();
      
    }
    
}
