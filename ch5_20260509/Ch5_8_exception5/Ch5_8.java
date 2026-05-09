/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20260509.Ch5_8_exception5;

/**
 *
 * @author xvpow
 */
public class Ch5_8 {

    static void testException(int option,String msg)
            throws Test1Exception,Test2Exception,Test3Exception{
        switch(option){
            case 1:
                throw new Test1Exception(msg);
            case 2:
                throw new Test2Exception(msg);
            case 3:
                throw new Test3Exception(msg);
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Test2Exception t2 = null;
        Test1Exception tx = t2;
        //越下越父
        //父類別必須放下面
//        try{
//            testException(3,"Test Erro1");    
//        }catch(Test2Exception ex){
//            System.out.println(ex);
//        }catch(Test1Exception ex){
//            System.out.println(ex);
//        }catch(Test3Exception ex){
//            System.out.println(ex);
//        }

//| 不可父子關係
      try{
            testException(3,"Test Erro1");    
        }catch(Test2Exception | Test3Exception ex){
            System.out.println(ex);
        }catch(Test1Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
