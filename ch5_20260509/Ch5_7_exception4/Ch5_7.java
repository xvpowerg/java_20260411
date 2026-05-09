/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_7_exception4;

/**
 *
 * @author xvpow
 */
public class Ch5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyData myData = new MyData();
       myData.initData();
       System.out.println("isEmpty:"+myData.isEmpty());
       
       try{
            String v1 = null;
            System.out.println(v1.length());
          
       }catch(Exception ex){
            System.out.println(ex);
       }finally{//一定會執行一次
           System.out.println("finally");
             myData.clear();
       }          
       
       System.out.println("isEmpty:"+myData.isEmpty());
    }
    
}
