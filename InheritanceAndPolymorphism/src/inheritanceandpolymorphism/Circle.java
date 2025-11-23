/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Circle  extends SimpleGeometricObjects{
    private double radius;
    
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double raidus, String color, boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;  
    }
    
    public double getDiameter(){
        return 2*this.radius;
    }
    
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }
    
    @Override
    public String toString(){
        return "The circle was created "+ super.toString()+"\n the radius is: " +radius;
    }
    
    @Override 
    public boolean equals(Object ob){
        if(ob instanceof Circle){
            return this.radius == ((Circle)ob).radius;
        }
        return false;
    }
    
}
