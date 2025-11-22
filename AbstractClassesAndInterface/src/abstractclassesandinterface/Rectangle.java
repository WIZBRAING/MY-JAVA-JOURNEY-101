/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    
    public Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    
    @Override 
    public double getArea(){
        return this.width * this.height;
    }
    
    @Override
    public double getPerimeter(){
        return 2*(this.width +this.height);
    }
    
    @Override 
    public String toString(){
        return super.toString() + " \nArea: "+this.getArea()+"\n";
    }
    
    @Override
    public boolean equals(Object o){
        if(this.getArea() == ((Rectangle)o).getArea())
            return true;
        else 
            return false;
    }
}
