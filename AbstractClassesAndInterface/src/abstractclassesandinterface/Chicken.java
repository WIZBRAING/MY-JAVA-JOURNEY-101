/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Chicken extends Animal implements Flyable, Edible, Walkable, Runnable {
    
    
    public Chicken(){
        super("Chicken","African","Terrestrial",1);
    }
    
    public Chicken(String type, String name, String habitat, int age){
        super(type,name,habitat,age);
    }
    
    @Override
    public void sound(){
        System.out.println("Chicken: cock-a-doodle-doo");
    }
    
    @Override 
    public void eat(){
        System.out.println(this.getName()+this.getType()+ " is eating");
    }
    
    @Override
    public String howToEat(){
        return "Chicken: Fry it";
    }
    
    @Override
    public void fly(){
        System.out.println(this.getName()+this.getType()+" is flying");
    }
    
    @Override 
    public void walk(){
        System.out.println(this.getName()+this.getType()+" is walking");
    }
    
    @Override
    public void run(){
        System.out.println(this.getName()+" "+this.getType()+" is running");
    }
}
