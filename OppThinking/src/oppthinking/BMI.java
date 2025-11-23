package oppthinking;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WIZBRAIN
 */
public class BMI {
    private String name;
    private int age;
    private double weigth;
    private double feet;
    private double inches;
    
    BMI(String name, int age, double weigth, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.feet = feet;
        this.inches = inches;
        System.out.printf(this.name+" age "+this.age+" has a BMI of "
                + ""+this.calulateBMI());
        System.out.println();
        
    }
    
    private double meters(){
        return (this.feet* 0.3048) + (this.inches* 0.0254);
    }
    
    private double calulateBMI(){
        return this.weigth / Math.pow(meters(), 2);
    }
}
