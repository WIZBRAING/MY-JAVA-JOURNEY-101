/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Triangle extends AbsGeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(){
        this(1,2,3);
    }
    
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public Triangle(double side1, double side2, double side3, String color, 
            boolean filled){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override 
    public double getArea(){
        double semiPerimt = this.getPerimeter()/2;
        return Math.sqrt(semiPerimt*(semiPerimt-this.side1)*
                (semiPerimt-this.side2)*(semiPerimt-this.side3));
    }
    
    @Override 
    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
    
    @Override 
    public String toString(){
        return "this Triangle was created on " + this.getDateCreated()+ 
                "\ncolor: "+this.getColor() + " and filled: " +
                this.getFilled()+".\nThe area and the perimter is "+
                this.getArea()+" and "+this.getPerimeter()+" respectively";
    }
    
    
}
