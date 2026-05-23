/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20260523.Ch7_2_resport;
import ch7_20260523.Ch7_2_erp.Erp;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class ErpReport extends Erp{
    protected void resportStyle(ArrayList<String> data){
        for (String s : data){
            //System.out.println(s);            
            String[] tmp = s.split(",");
            Employee emp = new Employee(tmp[0]);
            emp.appendScore(Integer.parseInt(tmp[1]));
            emp.appendScore(Integer.parseInt(tmp[2]));
            emp.appendScore(Integer.parseInt(tmp[3]));
            System.out.println(emp);
        }
    }
}
