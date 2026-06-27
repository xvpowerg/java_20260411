/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20260627.Ch12_6_stream5;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public Optional<String> getNameOp(){
        return Optional.ofNullable(name);
    }
}
