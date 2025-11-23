/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;

/**
 *
 * @author WIZBRAIN
 */
public class Loan {
    private double amount;
    private java.util.Date date;
    private double annualInterestRate;
    private int years;
    
    public Loan(double amount, double interest, int years)throws IllegalArgumentException{
        if( amount <=0 || interest <=0 || years <= 0){
            throw new IllegalArgumentException("Invalid loan amount or interest or years");
        }  else {
            this.amount = amount ;
            this.annualInterestRate = interest;
            this.years = years;
            date = new java.util.Date();
        }
    }
    
    
    public Loan(){
        this(2.5, 1,1000);
    }
    
    public void setAmount(double amount)throws IllegalArgumentException{
        if(amount <= 0 ){
            throw new IllegalArgumentException("Invalid loan amount");
        } else {
            this.amount = amount;
        }
    }
    
    public void setAnnualInterestRate(double interest) throws IllegalArgumentException{
        if(interest <= 0){
            throw new IllegalArgumentException("Invalid loan interest");
        } else {
            this.annualInterestRate = interest;
        }
    }
    
    public void setYears(int years)throws IllegalArgumentException{
        if(years <= 0){
            throw new IllegalArgumentException("Invalid loan years");
        } else {
            this.years = years;
        }
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public java.util.Date getDate(){
        return this.date;
    }
    
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    
    public int getYears(){
        return this.years;
    }
    
    public double getMonthlyPayment(){
        double monthlyInterest = this.annualInterestRate / 1200;
        double monthlyPayment = this.amount * monthlyInterest /
                (1- (1 / Math.pow(1 + monthlyInterest, this.years * 12)));
        return monthlyPayment;
    }
    
    public double getTotalPayment(){
        double totalPayment = this.getMonthlyPayment() * this.years *12;
        return totalPayment;
    }
    
}
