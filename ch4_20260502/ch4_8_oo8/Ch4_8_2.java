/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20260502.ch4_8_oo8;

/**
 *
 * @author xvpow
 */
public class Ch4_8_2 {

    static void printProduct(Product p){
        p.printInfo();
    }
    public static void main(String[] args) {
        //多型
        Product p1 = new MyPhone("iPhon11",95000);
        Product p2 =  new TvGame("switch9",35000);
        printProduct(p1);
        printProduct(p2);
        
        
        Product[] prods = {p1,p2};
        for (Product p : prods){
            p.printInfo();
        }
    }
    
}
