/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author WIZBRAIN
 */
public class HextFormatException extends NumberFormatException{
   public HextFormatException(){
        super("Invalid Hexadecimal format.");
    }
    
}
