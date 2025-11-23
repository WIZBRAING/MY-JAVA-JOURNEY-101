/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.text.DecimalFormat;
/**
 *
 * @author WIZBRAIN
 */
public class CircleWithException {
    private double radius;
    private static int numOfObjects = 0;
    private DecimalFormat df = new DecimalFormat("#.00");
    
    CircleWithException(double radius) throws IllegalArgumentException{
        this.setRadius(radius);
        numOfObjects ++;
    }
    
    CircleWithException(){
        this(1);
    }
    
    public void setRadius(double radius)
    throws IllegalArgumentException{
        if(radius >= 0){
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative:("+radius+")");
        }
    }
    
    public double getRadius(){
        return Double.parseDouble(df.format(this.radius));
    }
    
    public double getPerimeter(){
        return Double.parseDouble(df.format((2*Math.PI*this.radius)));
    }
    
    public double getArea(){
        return Double.parseDouble(df.format(Math.PI * Math.pow(radius, 2)));
    }
    public static int getNumberOfObjects(){
        return CircleWithException.numOfObjects;
    }
    
    
}
