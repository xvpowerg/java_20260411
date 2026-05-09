/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20260509.Ch5_10_override3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    //不拋出
//    public void testException(){
//        
//    }
    
//      @Override
//      public void testException()
//                 throws MainException{
//          
//      }  
    //拋出子類
        @Override
        public void testException()
                throws SubException{
            System.out.println("Test2");
        }
    //複寫如拋出RuntimeException類型 無限制    
        @Override
        public void testRuntimeEx()throws NullPointerException{
            
        }
}
