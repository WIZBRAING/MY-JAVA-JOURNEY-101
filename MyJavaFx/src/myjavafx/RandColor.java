/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.scene.paint.Color;
import java.util.Random;
/**
 *
 * @author WIZBRAIN
 */
public class RandColor {
    
    public RandColor(){
        
    }
    
    
    
    public static Color getColor(){
        Random rand = new Random();
        
        return Color.rgb(rand.nextInt(),rand.nextInt() , 
                rand.nextInt());
    }
    
    
}
