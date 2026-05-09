/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_7_exception4;

/**
 *
 * @author xvpow
 */
public class MyData {
    private String[] data = new String[1000];
    public void initData(){
        for(int i  =0; i< data.length;i++){
            data[i] = "A";
        }
    }
    
    public void clear(){
        data = null;
        data = new String[1000];
    }
    public boolean isEmpty(){
       
        for (String v : data){
            if (v != null){
                return false;
            }           
        }
       
        return true;
    }
}
