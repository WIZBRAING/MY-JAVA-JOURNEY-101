/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Faculty extends Employee{
    private String rank;
    private int officeHours;
    
    public Faculty(){
        
    }
    
    public Faculty(String rank, int officeHours){
        this.rank = rank;
        this.officeHours = officeHours;
    }
    
    public Faculty(String rank, int officeHours,String office, double salary,
            String name, String address, String phone, String email){
        
        super(office,salary,name,address,phone,email);
        this.rank = rank;
        this.officeHours = officeHours;
    }
    
    public String getRank(){
        return this.rank;
    }
    
    public int getOfficeHours(){
        return this.officeHours;
    }
    
    public void setRank(String rank){
        this.rank = rank;
    }
    
    public void setOfficeHours(int hours){
        officeHours = hours;
    }
    
    @Override
    public String toString(){
        return "Faculty: "+this.getName();
    }
    
}
