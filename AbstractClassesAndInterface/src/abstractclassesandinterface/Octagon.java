/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Octagon extends GeometricObject implements Cloneable{
    private double side;
    
    public Octagon(double side){
        this.side = side;
    }
    
    public double getArea(){
        return ((2+4/Math.sqrt(2))*this.side *this.side);
    }
    
    public double getPerimeter(){
        return this.side * 8;
    }
    
    @Override 
    public Octagon clone()throws CloneNotSupportedException{
        return (Octagon) super.clone();
    }
    
    
    
}
