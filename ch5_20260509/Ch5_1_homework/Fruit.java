/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_1_homework;

/**
 *
 * @author xvpow
 */
public class Fruit {
    private String name;
    private int price;
    public Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
}
