/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;
import javafx.geometry.Point2D;
/**
 *
 * @author WIZBRAIN
 */
public class circle2D {
    private double x;
    private double y;
    private double radius;
    
    circle2D(int x, int y,double radius){
        this.x=x;
        this.y=y;
        this.radius = radius;
    }
    
    circle2D(){
        this(0,0,1);
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double getRadius(){
       return this.radius;
    }
    public double getArea(){
        return (Math.pow(this.radius, 2)*Math.PI);
    }
    
    public double getPerimeter(){
        return (2*Math.PI*this.radius);
    }
    
    public boolean contains(double x, double y){
        double distance=0;
        distance = Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y), 2));
        return distance<=this.radius;
    }
    
    public boolean contains(circle2D circle){
        double distance=0;
        distance = Math.sqrt(Math.pow((circle.getX()-this.x),2 )+
                Math.pow((circle.getY()-this.y),2));
        return distance+circle.radius <= this.radius;
    }
    
    public boolean overlaps(circle2D circle){
        double distance=0;
        distance = Math.sqrt(Math.pow((circle.getX()-this.x), 2)+
                Math.pow((circle.getY()-this.y), 2));
        return (distance<(this.radius+circle.getRadius())
                & distance > Math.abs(this.radius-circle.getRadius()));
    }
}
