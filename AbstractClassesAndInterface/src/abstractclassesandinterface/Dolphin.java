/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Dolphin extends Animal implements Swimmable{
    
    @Override
    public void sound(){
        System.out.println( "euwm euwm euwm");
    }
    
    @Override
    public void eat(){
        System.out.println(this.getName()+this.getType()+ " is eating");
    }
    
    @Override 
    public void swim(){
        System.out.println(this.getName()+" "+this.getType()+ " is swimming");
    }
}
