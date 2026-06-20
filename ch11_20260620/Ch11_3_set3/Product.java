/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20260620.Ch11_3_set3;

/**
 *
 * @author xvpow
 */
public class Product {
     public Product(String name, String location, int price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }


    private String name;
    private String location;
    private int price;
    
    public String toString(){
        return this.getName()+":"+this.getLocation()+":"+this.getPrice();
    }
}
