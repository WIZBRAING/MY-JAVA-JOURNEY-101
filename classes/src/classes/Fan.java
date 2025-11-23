/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
/**
 *
 * @author WIZBRAIN
 */
public class Fan {
    private final int low=1, medium=2, fast=3;
    private int speed ;
    private boolean on;
    private double radius;
    private String color;
    
    Fan(){
        this.speed = this.low;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }
    
    public void setSpeed(String speed){
        
        switch(speed.toLowerCase()){
            case "low":
                this.speed = this.low;
                break;
            case "medium":
                this.speed = this.medium;
                break;
            case "fast":
                this.speed = this.fast;
                break;
            default:
                System.out.print("Invalid input");
        }
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setPower(boolean on){
        this.on = on;
    }
    
    public boolean getPower(){
        return this.on;
    }
    
    public void setRadius(double radius){
       this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    
    public void detailsToString(){
        if(this.getPower()){
            System.out.println(
           "The fan speed is "+this.getSpeed()+", the color is "
             + ""+this.getColor() +" the radius of the fan is "
                     + ""+this.getRadius());
        } else {
            System.out.println(
              "The fan is "+this.getColor()+", "
                      + "the radius is "+this.getRadius()+""
                              + " but the fan is off" );
        } 
    }
}
