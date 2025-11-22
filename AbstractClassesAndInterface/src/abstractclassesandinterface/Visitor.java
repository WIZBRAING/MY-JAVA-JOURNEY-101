/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author WIZBRAIN
 */
public class Visitor {
    
    private AnimalsWatched animalsWatched;
    
    
    public Visitor(){  
        try{

            animalsWatched = new AnimalsWatched();
        }
        catch(FileNotFoundException e){
            
            System.out.println("File not found");
        }
        catch(IOException e){
            
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public void watchAnimal(Animal animal){
        System.out.println("Watching "+animal.getName()+" "+animal.getType());
        
        try{
            
            animalsWatched.watched(animal); 
        }
        catch(FileNotFoundException e){ 
            
            System.out.println("file not found");
        }
        catch(IOException e){
            
            System.out.println(e.getMessage());  
        }
    }
    
    
    public void listenToSound(Animal animal){
        System.out.println("Listening to the sound of "
                + ""+animal.getName()+" "+animal.getType());
    }
    
    
    public void listWatchedAnimals(){ 
        try{
            
            System.out.println(animalsWatched.getWatchedAnimals());
        }
        catch(FileNotFoundException e){
            
            System.out.append("file not found");
        }
        catch(IOException e){
            
            System.out.println(e.getMessage());
        }
    }
    
}
