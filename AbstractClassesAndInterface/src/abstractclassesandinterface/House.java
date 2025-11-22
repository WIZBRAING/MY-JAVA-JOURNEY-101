/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class House implements Cloneable, Comparable<House> {
    private double area;
    private int id;
    private java.util.Date whenBuilt;
    
    public House(int id, double area){
        this.id =id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }
    
    
    //shallow cloning
   /* @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }*/
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        House houseClone = (House)super.clone();
        houseClone.whenBuilt = (java.util.Date) whenBuilt.clone();
        return houseClone;
    }
    
    @Override
    public int compareTo(House o){
        if(this.area > o.area)
            return 1;
        else if(this.area < o.area )
            return -1;
        else 
            return 0;
    }
    
}
