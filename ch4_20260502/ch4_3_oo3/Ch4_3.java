/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20260502.ch4_3_oo3;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Animal a1 = new Animal();
     a1.setName("LuLu");
     a1.setHeight(10);
     a1.printInfo();
    Animal a2 = new Animal("Bobo",17.2f);
    a2.printInfo();
    
    Dog dog1 = new Dog();
    dog1.setName("Money");
    dog1.setHeight(10);
    dog1.printInfo();
    
    Cat cat1 = new Cat();
    cat1.setName("Kitty");
    cat1.setHeight(12);
    cat1.printInfo();
    //kitty
    //12
    Dog dog2 = new Dog("Yuyu",5);
    dog2.printInfo();
    Cat cat2 = new Cat("mimi",2.5f);
    cat2.printInfo();
    
    }
    
}
