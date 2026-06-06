/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.base2;
import tw.com.base1.Student;
import tw.com.base1.Teacher;
/**
 *
 * @author xvpow
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new  Student("Iris",25);
        Teacher tc = new Teacher("Lucy",30);
        Car car1 = new Car("BMW");
        
        System.out.println(st1);
        System.out.println(tc);
        System.out.println(car1);
    }
    
}
