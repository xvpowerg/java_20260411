/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20260530.ch8_1_homework;
import java.util.ArrayList;
import java.util.List;

public class Student implements MyIterator {
    private String name;
    private ArrayList<Integer> scroes = new ArrayList();
    public Student(String name){
        this.name = name;
    }
    public void addScore(int score){
        scroes.add(score);
    }
    public List<String>getData(){
        List<String> dataList  = new ArrayList<>();
        dataList.add(name);
        for (Integer s : scroes){
            dataList.add(s+"");
        }
        return dataList;
    }
    //姓名
    //有很多成績
    //透過建構式 寫入name
    //addScore 寫入多筆成績
    //希望Student 可以放入showList 顯示name與成績
    
}
