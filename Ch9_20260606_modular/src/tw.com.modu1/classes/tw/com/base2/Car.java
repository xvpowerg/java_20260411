/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.base2;

/**
 *
 * @author xvpow
 */
public class Car {
    private String  company;
    public Car(String company){
        this.company = company;
    }
    
    public String toString(){
        return "Car:"+this.company;
    }
    
}
