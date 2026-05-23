/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20260523.Ch7_8_if6;

/**
 *
 * @author xvpow
 */
public class Ch7_8 {

    static void showList(MyIterator it){
        it.foreach();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Fruit f1 = new Fruit("Apple",25);
        Fruit f2 = new Fruit("Banana",15);
        Fruit f3 = new Fruit("Cherry",18);
        FruitBasket fb = new FruitBasket();
        fb.addFruit(f1);
        fb.addFruit(f2);
        fb.addFruit(f3);
        showList(fb);
    }
    
}
