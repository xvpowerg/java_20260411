/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_2_static1;

/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private int salary;
    //static 資源共享 所有物件會共用static的變數
    //類別變數
    private static String company;
    Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    
    void printInfo(){
        System.out.println(this.name+":"+
                this.salary+":"+Employee.company);
    }
    
    public void setSalary(int salary){
        this.salary = salary;
        
    }
//    public void setCompany(String company){
//        this.company = company;
//    }
      public void setCompany(String company){
        Employee.company = company;
    }
    
}
