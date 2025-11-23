/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author WIZBRAIN
 */
public class MyFile {
    private static java.util.ArrayList<String> listOfFiles
            = new java.util.ArrayList();;
    private java.io.File file;
    private java.io.PrintWriter write ;
    private java.util.Scanner read;
    
    public MyFile(String fileName){
        if(!listOfFiles.contains(fileName)){
            file  = new java.io.File(("MyFile/"+fileName.trim()));
            listOfFiles.add(fileName);
        } else {
            System.out.println("File; "+fileName+" already exists");
        }  
    }
    
    
    public void writeToFile(String text){
        if(!text.isEmpty()){
            try{
                write = new java.io.PrintWriter(file); 
                write.print(text);
                write.close();
                System.out.println("Text successfully written");
            }
            catch(java.io.FileNotFoundException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    
    
    
    public void appendToFile(String text){
        try{
            write = new java.io.PrintWriter(this.file);
            write.append(text);
            write.close();
            System.out.println("Text appended successfully");
            write.close();
        }
        catch(java.io.FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
        
    
    public void readFromFile(){
        try{
            read = new java.util.Scanner(file);
            String text;
            while(read.hasNext()){
               text = read.nextLine();
               System.out.println(text);
               read.close();
            }
        }
        catch(java.io.FileNotFoundException ex ){
            System.out.println(ex.getMessage());
        }
        catch(java.io.IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    public static void listOfFiles(){
        if(!listOfFiles.isEmpty()){
            for(String f:listOfFiles){
                System.out.println(f);
            }
        } else {
            System.out.println("There's no file");
        }
    }
    
    
    public void renameFile(java.io.File name){
        if(file.exists()){
            String oldName = file.getName();
            int index = listOfFiles.indexOf(oldName);
            file.renameTo(name);
            listOfFiles.add(index, name.getName());
            listOfFiles.remove(oldName);
        }
    }
    
    public void deleteFile(){
        if(listOfFiles.contains(this.file.getName())){
            listOfFiles.remove(this.file.getName());
            file.delete();
        }      
    }
}
