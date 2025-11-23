/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author WIZBRAIN
 */
public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public Object peek(){
        return list.get(list.size()-1);
    }
    
    public Object pop(){
        Object a;
        a = list.get(list.size()-1);
        list.remove(list.size()-1);
        return a;
    }
    
    public void push(Object o){
        list.add(o);
    }
    
    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}
