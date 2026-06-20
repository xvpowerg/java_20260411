/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20260620.Ch11_1_set1;

/**
 *
 * @author xvpow
 */
public class Product implements Comparable<Product>{
    
    
      public int compareTo(Product p1){
          if (this.price > p1.price){
              return 1;
          }else if(this.price < p1.price){
              return -1;
          }else if(this.name.compareTo(p1.name) != 0){
          
              return this.name.compareTo(p1.name);
          }
          
          
        return this.location.compareTo(p1.location);
    }
    
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
