/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author WIZBRAIN
 */
public class Account {
    private int id;
    private double balance,annualInterestRate;
    private java.util.Date dateCreated;
    
    Account(){
        this.id =0;
        this.balance =0;
        this.annualInterestRate = 0;
        this.dateCreated =  new java.util.Date();
    }
    
    Account(int id, double bal,double rate){
        this.id = id;
        this.balance = bal;
        this.annualInterestRate = rate;
        this.dateCreated = new java.util.Date();
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    
    public void printBalance(){
        System.out.println("Your account balance is "+getBalance());
    }
        
    public void deposit(double amount){
        this.balance += amount;
    }
    
    
    public void withdraw(double amount){
        this.balance -=amount;
    }
    
    
    public void setAnnualInterestRate(double rate){
        this.annualInterestRate = ((rate)/100);
    }

    
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    
    
    public double getMonthlyInterestRate(){
        return (this.getAnnualInterestRate()/12);
    }
    
    
    public double getMonthlyInterest(){
        return (this.balance * this.getMonthlyInterestRate());
    }

    public void getDateCreated(){
        System.out.println("the account is created on "+this.dateCreated.toString());
 }
}
