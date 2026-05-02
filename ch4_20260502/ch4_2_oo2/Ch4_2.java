/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20260502.ch4_2_oo2;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Ken");
        st1.setAge(15);
        st1.printInfo();
        
        Student st2 = new Student("Iris",25);
        st2.printInfo();
        Student st3 = new Student();
        st3.printInfo();//希望輸出empty : 0
        
    }
    
}
