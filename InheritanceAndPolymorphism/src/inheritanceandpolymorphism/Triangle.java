/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Triangle extends SimpleGeometricObjects {
    private double side1, side2, side3;
    
    public Triangle(){
        side2 = side3 = side1 = 1.0;
    }
    
    public Triangle(double a, double b , double c){
        side1 = a;
        side2 = b;
        side3 = c;
    }
    
    public Triangle(double a, double b, double c, String color, boolean filled){
        super(color, filled);
        side1 = a;
        side2 = b;
        side3 = c;
    }
    
    public double getPerimeter(){
        return (side1+side2+side3);
    }
    
    public double getArea(){
        double semPeri = getPerimeter()/2;
        return Math.sqrt(semPeri*(semPeri-side1)*(semPeri-side2)*(semPeri-side3));
    }
    
    @Override
    public String toString (){
        return super.toString()+"\n"+""
                + "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
    
    
}
