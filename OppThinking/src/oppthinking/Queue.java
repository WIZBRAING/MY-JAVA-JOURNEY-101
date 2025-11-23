/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_SIZE =8;
    
    Queue(){
        this(Queue.DEFAULT_SIZE);
    }
    
    Queue(int size){
        elements = new int[size];
    }
    
    public boolean isEmpty(){
        return this.size ==0;
    }
    
    public void enqueue(int value){
        if (this.size >= this.elements.length){
            int[] tempElements = new int[this.elements.length*2];
            System.arraycopy(this.elements, 0, tempElements, 
                    0, this.elements.length);
            this.elements = tempElements;
        }  
        this.elements[this.size++] = value;
    }
    
    
    public int dequeue(){
        int temp =this.elements[0];
        if(!(this.size >= this.elements.length)){
            for(int i=0; i<this.size; i++){
                this.elements[i] = this.elements[i+1];
            } 
        } else {
            for(int i=0; i<this.size-1; i++){
                this.elements[i] = this.elements[i+1];
            }
            this.elements[this.size-1]=0;
        }
          this.size--;
        return temp;
    }
    
    
    public int getSize(){
        return this.size;
    }
    
    public int getCapacity(){
        return this.elements.length;
    }
}//END OF OUR CLASS
