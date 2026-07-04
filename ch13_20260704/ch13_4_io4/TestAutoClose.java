/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20260704.ch13_4_io4;

/**
 *
 * @author xvpow
 */
public class TestAutoClose implements AutoCloseable {
    private String name;
    private boolean theowEx;
    
    
    public void close()throws Exception{
        System.out.println(name+":close");
        if (theowEx){
            throw new Exception(name+":Error");
        }
    }

    public TestAutoClose(String name, boolean theowEx) {
        this.name = name;
        this.theowEx = theowEx;
    }

    @Override
    public String toString() {
        return "TestAutoClose{" + "name=" + name + ", theowEx=" + theowEx + '}';
    }
    
    
}
