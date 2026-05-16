/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_2_static1;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Employee emp1 = new Employee("Ken",30000);
       Employee emp2 = new Employee("Iris",25000);
      emp1.printInfo();
      emp1.setSalary(50000);//設定emp1不影響emp2 屬於物件變數
      emp1.printInfo();
      emp2.printInfo();
      
      emp1.setCompany("Google");
      emp1.printInfo();
      emp2.printInfo();
      emp1.setCompany("IBM");
       emp1.printInfo();
      emp2.printInfo();
    }
    
}
