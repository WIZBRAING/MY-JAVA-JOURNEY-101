/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Transactions {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transactions(){
        this.date = new java.util.Date();
    }
    
    public Transactions(char type, double amount, double balance,
            String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new java.util.Date();
    }
    
    public void setType(char type){
        this.type = type;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public char getType(){
        return this.type;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public String getDescription(){
        return this.description;
    }
    public java.util.Date getDate(){
        return this.date;
    }
}
