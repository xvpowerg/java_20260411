/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20260502.ch4_8_oo8;

/**
 *
 * @author xvpow
 */
public class Product {
    
    private String name;
    private int price;
    public Product(){               
    }
    public Product(String name,int price){
            this.name = name;
            this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    
    public void printInfo(){
        System.out.println(this.getName()+":"+this.getPrice());
    }
            
    
}
