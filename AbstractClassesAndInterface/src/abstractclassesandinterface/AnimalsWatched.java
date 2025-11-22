/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author WIZBRAIN
 */
public class AnimalsWatched {
    private String fileName;
    private String folder;
    private File file;
    private static int users=0;
    
    
    AnimalsWatched()throws FileNotFoundException,IOException{
        
        this.fileName = "user_"+users+"_watched_list";
          this.folder = "files";
            this.file = new File(folder,this.fileName+users); 
        
        if(!file.exists()){
            file.createNewFile();
        } 
        
        users++;
    }
    
    
    public void watched(Animal animal)throws FileNotFoundException,IOException{
        
        PrintWriter writer = new PrintWriter(file);
          writer.println(animal.getName()+" "+animal.getType());
            writer.close();  
    }
    
    public String getWatchedAnimals()throws FileNotFoundException, IOException{
        java.util.Scanner reader = new java.util.Scanner(file);
           String watchedAnimals = "";
           
        while(reader.hasNext()){
            String line = reader.nextLine();
            watchedAnimals += line + "\n";
        }
        
        reader.close();
          return watchedAnimals;
    }
}//END OF CLASS 
