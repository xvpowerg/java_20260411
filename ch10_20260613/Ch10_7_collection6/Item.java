/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20260613.Ch10_7_collection6;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return this.name+":"+this.price;
    }
    //hashCode 相等 equals是true的機率很大
    //hashCode 不相等 equals一定是false
    
    public int hashCode(){        
        System.out.println("hashCode:"+this);
        return this.price+this.name.hashCode();
    }
    public boolean equals(Object obj){
        System.out.println("equals:"+this);
        if (obj == null || obj instanceof Item == false){
            return false;
        }
        Item tmpItem = (Item)obj;
        return this.price == tmpItem.price 
                && this.name.equals(tmpItem.name);
    }
}
