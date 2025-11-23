/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;


/**
 *
 * @author WIZBRAIN
 */
public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    
    Triangle(double s1, double s2, double s3) throws IllegalTriangleException{
        if((side1 + side2)<= side3 || (side1+side3) <= side2 || (side2+side3)<=side1){
            throw new IllegalTriangleException("Invalid Triangle");
        } else {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
        }    
    }
    
    public double getArea(){
        double semiPerimeter = this.getPerimeter()/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-this.side1)*
                (semiPerimeter-this.side2)*
                (semiPerimeter-side3));
    }
    public double getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }
    
    
}
