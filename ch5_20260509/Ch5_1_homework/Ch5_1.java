/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_1_homework;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    
    static int fruitPriceTotal(Fruit ... fs){
        int total = 0;
        for (Fruit f : fs){
            total += f.getPrice();
        }
        return total;
    }
     
    public static void main(String[] args) {
       //作業
        /*父類別 Fruit 放共同屬性：String name、int price
        子類別 Apple、Banana 繼承 Fruit
        再寫一個方法，把所有水果的 price 加總。*/
        Fruit f1 = new Apple("A1",20);
        Fruit f2 = new Banana("B1",10);
        Fruit f3 = new Apple("A2",50);
        Fruit f4 = new Banana("B2",15);
        Fruit f5 = new Banana("B3",30);
        int ans = fruitPriceTotal(f1,f2,f3,f4,f5);
        System.out.println(ans);
    }
    
}
