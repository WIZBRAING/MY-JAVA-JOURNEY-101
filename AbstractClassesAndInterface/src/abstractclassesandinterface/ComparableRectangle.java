/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class ComparableRectangle extends Rectangle implements Cloneable {
    
    
    public ComparableRectangle(double width, double height){
        super(width,height); 
    }
    
    @Override 
    public ComparableRectangle clone()throws CloneNotSupportedException{
        return (ComparableRectangle) super.clone();
    }
}
