/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.util.ArrayList;
/**
 *
 * @author WIZBRAIN
 */
public class MyStack implements Cloneable{
    
    private ArrayList<Object> list;
    
    public MyStack(){
        list = new ArrayList<>();
    }
    
    public Object pop(){
        Object val = this.list.get(this.list.size()-1);
        this.list.remove(this.list.size()-1);
        return val;
    }
    
    public Object peek(){
        return this.list.get(this.list.size()-1);
    }
    
    public void pust(Object o){
        this.list.add(o);
    }
    
    public int getSize(){
        return this.list.size();
    }
    
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
    
    @Override 
    public String toString(){
        return this.list.toString();
    }
    
    @Override 
    public MyStack clone()throws CloneNotSupportedException{
        MyStack cln = (MyStack) super.clone();
        cln.list = (ArrayList) this.list.clone();
        return cln;
    }
}
