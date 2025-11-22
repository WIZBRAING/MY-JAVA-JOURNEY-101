/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public abstract class GeometricObject extends AbsGeometricObject implements
        Comparable<GeometricObject>{

           
    public GeometricObject(){
        
    }
    
    public GeometricObject(String col, boolean filled){
        super(col,filled);
    }
    
    public static GeometricObject max(GeometricObject obj, GeometricObject obj1){
        return (obj.getArea()>obj1.getArea()? obj:obj1);
    }

    @Override 
    public int compareTo(GeometricObject o){
        if(this.getArea()>o.getArea()){
            return 1;
        } else if(this.getArea()<o.getArea()){
            return -1;
        } else 
            return 0;
    }

}
