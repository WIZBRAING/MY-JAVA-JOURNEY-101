/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Square extends GeometricObject implements Colorable{
    private int side;

    public Square(){
        this(1);
    }
    
    public Square(int side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return this.side * this.side;
    }
    
    @Override 
    public double getPerimeter(){
        return this.side *4;
    }
    
    @Override 
    public void howToColor(){
        System.out.println("Color all four sides.\n"
                + "Color left, right, top and button.");
    }
    
    @Override 
    public String toString(){
        return this.getClass()+"";
    }
    
}
