/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author WIZBRAIN
 */
public class AI {
    
    AI(){
        
    }

    //EXERCISE 12.11////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void removeText(String text, File file) {
        try {
            String str = getText(file);
            writeText(str.replace(text, ""), file);  // Use replace instead of replaceAll
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private String getText(File file) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                content.append(reader.nextLine()).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + file.getAbsolutePath());
        }
        return content.toString();
    }

    public void writeText(String text, File file) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write(text);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + file.getAbsolutePath());
        }
    }

    
    
}//END OF CLASS
