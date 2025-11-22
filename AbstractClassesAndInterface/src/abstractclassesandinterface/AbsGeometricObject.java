/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public abstract class AbsGeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated ;
    
    protected AbsGeometricObject(){
        dateCreated = new java.util.Date();
        
    }
    
    protected AbsGeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }
    
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setFilled(boolean filled ){
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public boolean getFilled(){
        return this.filled;
    }
    
    public String getDateCreated(){
        return this.dateCreated.toString();
    }
    
    @Override 
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + 
                " and filled: " + filled;
    }
    
    public static boolean equalArea(AbsGeometricObject obj1, AbsGeometricObject obj2){
        return obj1.getArea() == obj2.getArea();
    }
    
    public static void displayGeometricObject(AbsGeometricObject object){
        System.out.println("\nThe Area is: "+object.getArea()+"\n"
                + "The perimeter is: "+object.getPerimeter()+"\n"
                        + "Date created: ");
    }
    
    public abstract double getPerimeter();
    public abstract double getArea();
    
    
    //EXERCISE 13.5

}
