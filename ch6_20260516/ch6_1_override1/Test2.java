/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_1_override1;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    
//    public void runMyException() throws TestException{
//        System.out.println("Test2 TestException");
//    }
    
//      public void runMyException() throws TestSubException{
//        System.out.println("Test2 TestSubException");
//        throw new TestSubException();
//    } 
    
//      public void runMyException(){
//        System.out.println("Test2 TestSubException");       
//    } 
    //因為沒有強制一定要catch 所以類型不在意
       public void runMyException()throws TestRuntimeException{
        System.out.println("Test2 TestRuntimeException");       
    } 
      
    //RuntimeException  
//    public void runMyRuntimeException()
//            throws TestRuntimeException{
//        System.out.println("Test2 TestRuntimeException");
//                
//    }
  //子類    
//     public void runMyRuntimeException()
//            throws TestSubRuntimeException{
//        System.out.println("Test2 TestSubRuntimeException");
//                
//    }
      
   //其他runtimeexception
//        public void runMyRuntimeException()
//            throws NullPointerException{
//        System.out.println("Test2 NullPointerException");
//                
//    }   
      
//    public void runMyRuntimeException()
//            throws TestException{
//        System.out.println("Test2 NullPointerException");
//                
//    }   
}
