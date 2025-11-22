/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author WIZBRAIN
 */

//WORK ON QUESTION 13.4 - 13.8
public class Exercises {
    //EXERCISE 13.16 has been completed as Complex /////////////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.16 has been completed as RationalCalculator //
    ///////////////////////////////////////////////////////////
    
    
    //EXERCISE 13.15 has not been completed ////////////////////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.14 has been completed as RationalArray class//
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.13 has been completed as Course class/////////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.12////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    public static double sumArea(GeometricObject[] a){
        double sumOfArea = 0;
        for(int i=0; i<a.length; i++){
            sumOfArea += a[i].getArea();
        }
        return sumOfArea;
    }
    
    //EXERCISE 13.11 has been completed as Octagon class////////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.10 has been completed as Rectangle class//////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.9 has been completed as Circle class//////////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.8 has been completed as MyStack class/////////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.7 has been completed as Colorable interface///
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.6 has been completed as comparableCirlce//////
    ///////////////////////////////////////////////////////////
    
    //EXERCISE 13.5 has been completed as GeometricObject//////
    //////////////////////////////////////////////////////////
    
    //EXERCISE 13.4 it has been completed as PrintCalendar_ class/
    /////////////////////////////////////////////////////////////
    
    
    
    //EXERCISE 13.3////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    public static void sort(ArrayList<Number> list){
        if(list.isEmpty()){
            System.out.println("list is empty.");
            return;
        }
        
        try{
            list.sort((a,b)->Integer.compare(a.intValue(), b.intValue()));
            System.out.println("The sorted list is: ");
            printList(list);
        }
        catch(IllegalArgumentException |UnsupportedOperationException |
                ClassCastException e ){
            e.printStackTrace();
        }
    }
    
    //EXERCISE 13.2////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    public static void shuffle(ArrayList<Number> list){
        if(list.isEmpty()){
            System.out.println("list is empty.");
            return;
        }
        
        try{
            Collections.shuffle(list);
            System.out.println("The shuffled list is: ");
            printList(list);
        }
        catch(UnsupportedOperationException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void printList(ArrayList<Number>list){
        for(Object o: list){
            System.out.println(o);
        }
    }
    //EXERCISE 13.1 is completed as a Triangle Class/////////
    ////////////////////////////////////////////////////////
}
