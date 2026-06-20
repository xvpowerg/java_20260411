/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20260620.Ch11_8_map5;

/**
 *
 * @author xvpow
 */
public class Item {
    private int price;
    private String name;

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "price=" + price + ", name=" + name + '}';
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    
    
}
