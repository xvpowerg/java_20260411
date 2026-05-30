/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch8_20260530.ch8_1_homework;

import java.util.List;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
      List<String> getData();
      default void foreach(PrintStyle ps){
          List<String> data = getData();
          for (String d : data){
              //System.out.println(d);
              ps.style(d);
          }
      }
}
