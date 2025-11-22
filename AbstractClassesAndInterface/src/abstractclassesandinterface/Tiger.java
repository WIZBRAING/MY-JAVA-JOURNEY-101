/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Tiger extends Animal implements Climbable, Walkable, Runnable {
    
    public Tiger(){
        super("Tiger","unknown","Terrestrial",5);
    }
    
    public Tiger(String type, String name, String habitat, int age){
        super(type,name,habitat,age);
    }
    
    
    @Override
    public void sound(){
        System.out.println( "Tiger: RROOAARR");
    }
    
    @Override 
    public void eat(){
        System.out.println(this.getName()+this.getType()+" is eating");
    }
    
    @Override 
    public void climb(){
        System.out.println(this.getName()+this.getType()+" is Climbing");
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
