/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author WIZBRAIN
 */
public class QuadraticEquation {
    private int a,b,c;
    
    QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b= b;
        this.c= c;
    }
    
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    public int getC(){
       return this.c;
    }
    
    public double getDiscriminant(){
        return ((Math.pow(this.b, 2))-(4*(this.a*this.c)));
    }
    
    public double getRoot1(){
       if(this.getDiscriminant()<0){
           return 0;
       }
        return (((-this.b)+(Math.sqrt(this.getDiscriminant())))/(2*(this.a)));
    }
    
    public double getRoot2(){
        if(this.getDiscriminant()<0){
            return 0;
        }
        return(((-this.b)-(Math.sqrt(this.getDiscriminant())))/(2*(this.a)));
    }
}
