/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
/**
 *
 * @author WIZBRAIN
 */
public class BindingDemo {
    
    
    public void bindingDemo1(){
        //Creating instances of Abstract class DoubleProperty 
        //using the corresponding concrete concrete SimpleDoubleProperty class
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        
        //Unidirectional binding
        d1.bind(d2.multiply(2));
        //Prints out binded vlaue 
        System.out.println("The value of d1 is: "+d1.getValue()+"\n"
                + "the value of d2 is: "+d2.getValue());
       
        //Setting value of d2
        d2.setValue(70);
        //Prints out binded value
        d1.bind(d2.add(2));
        System.out.println("d1 value is: "+d1.getValue()+"\n"
                + "d2 value is: "+d2.getValue());
        
        //Bidirectional Binding
        d1.bindBidirectional(d2);
        //prints out binded bidirectional value
        System.out.println("d1 value is: "+d1.getValue()+"\n"
                + "d2 value is: "+d2.getValue());
    }
    
    public void bindingDemo2(){
        
    }
}
