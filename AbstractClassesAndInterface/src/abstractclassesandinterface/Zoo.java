/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.util.ArrayList;
/**
 *
 * @author WIZBRAIN
 */
public class Zoo {
    ArrayList<Zookeeper> zookeepers;
    ArrayList<Visitor> visitors;
    ArrayList<Animal> animals;
    
    public Zoo(){
        zookeepers = new ArrayList<>();
        visitors = new ArrayList<>();
        animals = new ArrayList<>();
    }
    
    public Zoo (Zookeeper keeper, Animal animal, Visitor visitor){
        this();
        
    }
    
    public void addZookeeper(Zookeeper keeper){
        this.zookeepers.add(keeper);
    }
    
    public void addVisitor(Visitor visitor){
        this.visitors.add(visitor);
    }
    
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
    
}
