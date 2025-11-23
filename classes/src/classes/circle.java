/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.Scanner;
/**
 *
 * @author WIZBRAIN
 */
public class circle {

    //private 
    double radius;
    private static int count=0;

    circle() {
        radius = 1;
        count++;
    }

    circle(double a) {
        radius = a;
        count++;
    }
    
    public static int numOfObjects(){
        return count;
    }

    public double getArea() {
        //System.out.println((2 * Math.PI * radius));
        return (radius * Math.PI * radius);
    }
    
    public double getPerimeter(){
        return (2*Math.PI *radius);
    }
    
    public void setRadius(double a){
        radius = a;
    }
    public double getRadius(){
        return radius;
    }
    
    public void getDetails(){
        System.out.println("The Radius of the circle is: " + getRadius());
        System.out.println("The Perimeter of the cirlce is: "+getPerimeter());
        System.out.println("The Area of the cirlce is: " + getArea());
    }
    
    public static void swap1 (circle a, circle b){
        circle temp = a;
        a = b;
        b = temp;
        System.out.println("circle1 radius: "+a.radius+" circle2 radius: "+b.radius);
    }
    
    public static void swap2(circle a, circle b){
        double temp = a.radius;
        a.radius = b.radius;
        b.radius = temp;
    }

}
