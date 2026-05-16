/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20260516.ch6_3_2_modifier_1;
import ch6_20260516.ch6_3_modifier_1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3 extends Test1 {
    //不同package
    public Test3(){
        //super(); // 因為public
        super("Test3 Hello!");//protected
        
    }
}
