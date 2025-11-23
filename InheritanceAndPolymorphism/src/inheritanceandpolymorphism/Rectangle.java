/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Rectangle extends SimpleGeometricObjects{
    private double width;
    private double height;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }
    
    public double getPerimeter(){
        return 2*(this.height + this.width);
    }
    public void printRectangle(){
        System.out.println(super.toString());
    }
    
    @Override
    public String toString(){
        return "the rectangle was "+super.toString()+".\nthe heigth is: "+height+" and the "
                + "width is: " +width;
    }
    
}
