/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20260523.Ch7_2_erp;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public abstract class Erp {
    private ArrayList<String> data = new ArrayList();
    
    private void initData(){
        data.add("Ken,75,80,60");
        data.add("Vivin,23,94,67");
        data.add("Lucy,95,16,88");
        data.add("Iris,95,16,79");
    }
    //一定要覆寫(Override)
    protected abstract void resportStyle(ArrayList<String> data);
    
    //不希望對方Override 可加上final
    //exportReport只能呼叫
    public final void exportReport(){
        initData();
        resportStyle(data);
    }
    
}
