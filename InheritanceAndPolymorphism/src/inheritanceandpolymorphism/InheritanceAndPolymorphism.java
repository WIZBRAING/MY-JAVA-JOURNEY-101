/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */ 
package inheritanceandpolymorphism;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;
/**
 *
 * @author WIZBRAIN
 */

public class InheritanceAndPolymorphism{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        

           
        
    }  //END OF MAIN METHOD 


    public static void arrayListExercise(){
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list1 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(2);
        list1.add(5);
        list1.add(7);
        list.add(5);
        list1.add(1);
        list1.add(1);
        list.add(2);
        list1.add(2);
        list1.add(1);
        list1.add(5);
        Methods.testUnion();
        removeDuplicate(list);
        removeDuplicate(list1);
    }
    
    
    public static void removeDuplicate(ArrayList<?> list){
        for(int i=0; i<list.size(); i++){
                for(int j=list.size()-1; j>i;j--){
                    if(list.get(i).equals( list.get(j))){
                        list.remove(j);
                    }
                }
        }  
        System.out.println("Duplicates Removed");
        for(Object o: list){
            System.out.print(o+" ");
        }
        System.out.println();
    }
    
    public static ArrayList<Integer> union(ArrayList<Integer> list1,
            ArrayList<Integer> list2){
        
        list1.addAll(list2);
       
        return list1;
    }
}







