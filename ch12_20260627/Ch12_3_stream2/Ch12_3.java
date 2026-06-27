/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20260627.Ch12_3_stream2;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //一個Stream 只能使用一次
        //Stream不會改變原始物件
        //Stream 有分惰性(回傳Stream)與終端(不回傳Stream)
        Stream<Integer> st1 = Stream.of(20,51,26,17,25,18);
        //st1.forEach(v->System.out.println(v));
        //st1.forEach(v->System.out.print(v+" "));//一個Stream 只能使用一次
        //st1.peek(v->System.out.println("peek:"+v)).skip(2);
        st1.peek(v->System.out.println("peek:"+v)).skip(2).forEach(v->System.out.println(v));

    }
    
}
