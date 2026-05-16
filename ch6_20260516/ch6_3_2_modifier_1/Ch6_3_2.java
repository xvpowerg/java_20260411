/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20260516.ch6_3_2_modifier_1;
import ch6_20260516.ch6_3_modifier_1.Test1;
import ch6_20260516.ch6_3_modifier_1.Test2;
public class Ch6_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test1();//因public跨package可讀到 所以Test1()可運行      
        Test1 t2  = new Test2();
        Test1 t3 = new Test3();
        
        
    }
    
}
