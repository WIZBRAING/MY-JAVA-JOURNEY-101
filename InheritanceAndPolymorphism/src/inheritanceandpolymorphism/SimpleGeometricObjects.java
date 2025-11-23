/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;
/**
 *
 * @author WIZBRAIN
 */
public class SimpleGeometricObjects {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public SimpleGeometricObjects(){
        this.dateCreated = new java.util.Date();
    }
    
    public SimpleGeometricObjects(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return this.dateCreated;
    }
    
    @Override
    public String toString(){
        return "Created on: "+this.dateCreated+"\nColor: "+this.color+
                ", and filled: "+this.filled;
    }
    
}
