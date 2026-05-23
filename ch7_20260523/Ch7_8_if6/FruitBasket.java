/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20260523.Ch7_8_if6;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class FruitBasket implements MyIterator {
    private ArrayList<Fruit> basket = new ArrayList();
    
    public void addFruit(Fruit f){
        basket.add(f);
    }
    public List<String> getData(){
        List<String> data = new ArrayList();
        for (Fruit f : basket){
            data.add(f.toString());
        }        
        return data;
    }
    
}
