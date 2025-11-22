/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class comparableCirlce extends Circle {
    
    public comparableCirlce(){
        this(1);
    }
    
    public comparableCirlce(double val){
        super(val);
    }
      
    public int compareTo(comparableCirlce o){
        if(this.getArea()>o.getArea()){
            return 1;
        } else if(this.getArea()<o.getArea()){
            return -1;
        } else 
            return 0;
    }
}
