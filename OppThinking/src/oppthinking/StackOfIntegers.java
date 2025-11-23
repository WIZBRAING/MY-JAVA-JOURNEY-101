/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class StackOfIntegers {
   private int[] elements;
   private int size;
   private static final int DEFAULT_SIZE = 16;
   
   StackOfIntegers(int size){
       this.elements = new int[size];
   }

   StackOfIntegers(){
       this(DEFAULT_SIZE);
   }
   
   public boolean empty(){
       return size==0;
   }
   
   public void push(int element){
       if(this.size>=elements.length){
           int[] temp = new int[this.elements.length *2];
           System.arraycopy(this.elements, 0, temp, 0, 
                   this.elements.length);
           this.elements = temp;
       }
       this.elements[this.size++]=element;
   }
   
   public int pop(){
       return this.elements[--this.size];
   }
    
   public int peek(){
       return this.elements[this.size-1];
   }
   
   public int getSize(){
       return this.size;
   }
   
   
   
}