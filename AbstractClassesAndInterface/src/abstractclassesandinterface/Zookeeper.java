/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Zookeeper {
    Animal animal;
    public Zookeeper(){
        
    }
    
    public void feed(Animal animal){
        System.out.println("feeding " +animal.getName()+" "+animal.getType());
    }
    
    public void check(Animal animal){
        System.out.println("Checking habitat of " +animal.getName()+" "+
                animal.getType());
    }
    
}
