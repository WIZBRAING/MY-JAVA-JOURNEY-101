/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;
import java.util.Date;
/**
 *
 * @author WIZBRAIN
 */
public class Account {
    private int id;
    private double balance;
    private double aIR;
    private Date dt;
    
    Account(){
        this(0,0,0);
    }
    
    Account(int i,double b,double ir){
        this.id = i;
        this.balance = b;
        this.aIR = ir;
        dt = new Date();
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setBalance(double bal){
        this.balance = bal;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void setAnnualInterestRate(double rate){
        this.aIR = ((rate)/100);
    }
    
    public double getAnnualInterestRate(){
        return this.aIR;
    }
    
    public Date getDateCreated(){
        return this.dt;
    }
    
    public double getMonthlyInterestRate(){
        return ((this.getAnnualInterestRate())/12);
    }
    
    public double getMonthlyInterest(){
        return (this.getMonthlyInterestRate()*this.balance);
    }
    
    public void withdraw(double amount){
        if(this.balance < amount || balance ==0){
            System.out.println("Invalid withdrawal!");
        } else {   
            System.out.println("You Successfully \nwithdraw "+amount+".");
            System.out.println("your current \nbalance is "+
                    (this.getBalance()-amount)+".");
            System.out.println("your previous \nbalance was "+
                    this.getBalance()+".");
            this.balance -= amount;
        }         
    }
    
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("You have successfully deposited "+amount);
    }
    
    
}
