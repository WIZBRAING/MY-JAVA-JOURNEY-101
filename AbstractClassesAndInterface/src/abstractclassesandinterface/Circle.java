/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Circle extends GeometricObject{
    private double radius;
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    
    @Override
    public double getPerimeter(){
        return Math.PI*2*this.radius;
    }
    
    public boolean equals(Circle o){
        if(this.radius == o.radius){
            return true;
        } else 
            return false;
    }
    
}
