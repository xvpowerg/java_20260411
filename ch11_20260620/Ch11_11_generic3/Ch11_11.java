/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20260620.Ch11_11_generic3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch11_11 {

    static void test1(ArrayList<Test1> list){
        System.out.println(list);
    }
    //支持多形
    static void test2(ArrayList<? extends Test1> list){
        //list.add(new Test1());//不可新增
        for (Test1 t1 : list){
            System.out.println(t1);
        }
    }
    //允許父類或自己
    //可以新增類型限定為泛型定義的類型
    //可輸出類型為Object
    
    static void showMyList3(ArrayList<? super Test3> list){
        list.add(new Test3());
        list.add(new Test3());
        
        for (Object v : list){
            System.out.println(v);
        }
    }
    
    public static void main(String[] args) {
       ArrayList<Test1> list1 = new ArrayList();
       test1(list1);
       Test1 t1 = new Test2();
       ArrayList<Test2> list2 = new ArrayList();
       //test1(list2);//不支持多形
       test2(list2);
        ArrayList<Test3> list3 = new ArrayList();
        showMyList3(list3);
    }
    
}

