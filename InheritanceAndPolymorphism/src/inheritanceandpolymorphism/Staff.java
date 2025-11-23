/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Staff extends Employee{
    private String title;
    
    public Staff(){
        
    }
    
    public Staff(String title){
        this.title = title;
    }
    
    public Staff(String title,String office, double salary,
            String name, String address, String phone, String email){
        
        super(office,salary,name,address,phone,email);
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return "Staff: "+this.getName();
    }
}
