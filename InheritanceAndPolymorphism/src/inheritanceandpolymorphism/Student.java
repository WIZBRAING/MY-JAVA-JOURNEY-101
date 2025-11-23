/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Student extends Person {
    private String status;
    
    public Student(){
        this.status = "Freshman";
    }
    
    public Student(String status,String name, String address, String phone, 
            String email){
        
        super(name,address,phone,email);
        this.status = status;
    }
    
    public Student(String stat){
        this.status = stat;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    @Override
    public String toString(){
        return "Student: "+getName();
    }
}
