/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20260425;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {
    
        static void test1(int i){
            System.out.print("p:"+i+" ");
            if (i < 5){
                test1(i+1);
            }
            System.out.println("E:"+i);
        }
   
    public static void main(String[] args) {
        // TODO code application logic here
        //產生一顯示1~5的迴圈
    
        
        for (int i =1; i<=5;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        test1(1);
        System.out.println();
    }
    
}
