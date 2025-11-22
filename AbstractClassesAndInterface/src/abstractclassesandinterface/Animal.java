/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public abstract class Animal implements  Comparable<Animal>, Cloneable{
    private String animalType;
    private String name;
    private String habitat;
    private int age;
    
    
    public abstract void sound();
    public abstract void eat();
    
    protected Animal(){
        this.animalType = "unknown";
        this.name = "unknown";
        this.habitat = "unknown";
        this.age = -1;
    }
    
    
    protected Animal(String type, String name, String habitat, int age){
        this.animalType = type;
        this.name = name;
        this.habitat = habitat;
        this.age = age; 
    }
    
    
    public void setType(String type){
        this.animalType = type;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    
    
    public void setAge(int age){
        this.age = age;
    }
    
    
    public void sleep(){
        System.out.println(this.name+" Is sleeping");
    }
    
    
    public int getAge(){
        return this.age;
    }
    
    
    public String getHabitat(){
        return this.habitat;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public String getType(){
        return this.animalType;
    }
    
    
    @Override
    public int compareTo(Animal o){
            return this.age - o.age;
    }
    
    @Override 
    public Object clone() throws CloneNotSupportedException{
        Animal animal = (Animal)super.clone();
        return animal;
    }
}
