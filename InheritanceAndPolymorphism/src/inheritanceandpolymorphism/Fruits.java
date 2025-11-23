/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Fruits {
    private String color;
    private String shape;
    private int size;
    private boolean ripe;
    
    
    
    public Fruits(){
        this("green","oval",3,false);
    }
    
    public Fruits(String color, String shape, int size, boolean ripe){
        this.color = color;
        this.shape = shape;
        this.size = 3;
        this.ripe = ripe;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setShape(String shape){
        this.shape = shape;
    }
    
    public String getShape(){
        return this.shape;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
    
    public void setToRipe(boolean ripe){
        this.ripe = ripe;
    }
    
    public boolean isRipe(){
        return this.ripe;
    }
    
}
