/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Employee extends Person{
    private java.util.Date dateHired;
    private String office;
    private double salary;
    
    public Employee(){
        dateHired = new java.util.Date();
    }
    
    public Employee(String office, double salary){
        dateHired = new java.util.Date();
        this.office = office;
        this.salary = salary;
    }

    public Employee(String office, double salary,
            String name, String address, String phone, String email){
        
        super(name,address,phone,email);
        dateHired = new java.util.Date();
        this.office = office;
        this.salary = salary;
    }
    
    public java.util.Date getDateHired(){
        return this.dateHired;
    }
    
    public String getOffice(){
        return office;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setOffice(String office){
        this.office = office;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return "Employee: "+this.getName();
    }
}
