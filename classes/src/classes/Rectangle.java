/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author WIZBRAIN
 */
public class Rectangle {
     double width;
     double heigth;
            
     Rectangle(double w, double h){
        this.width = w;
        this.heigth = h;
    }      
     Rectangle(){
        this.width = 1;
        this.heigth =1;
    }
     
     
     public double getArea(){
         return this.width *this.heigth;
     }
     
     public double getPerimeter(){
         return 2*this.width + 2*this.heigth;
     }
     public void printRectDetails(){
         System.out.printf("%-20s%-20s%-20s%-20s\n","Width","Heigth","Perimeter","Area");
         System.out.printf("%-20f%-20f%-20f%-20f\n",this.width,this.heigth,this.getPerimeter(),this.getArea());
     }
     
     
}
