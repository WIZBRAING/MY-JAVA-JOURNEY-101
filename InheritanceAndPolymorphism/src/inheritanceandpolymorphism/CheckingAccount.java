/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class CheckingAccount extends Account {
    private double overdraftLimit;
    
    public CheckingAccount(){
        this.getOverdraftLimit();
    }
    
    public CheckingAccount(int i,double b,double ir){
        super(i,b,ir);
        this.getOverdraftLimit();
    }
    
    public CheckingAccount(int i,double b,double ir, double overdraft){
        super(i,b,ir);
        this.setOverdraftLimit(overdraft);
    }
    
    public void setOverdraftLimit(double amount){
        this.overdraftLimit = amount;
    }
    
    public void getOverdraftLimit(){
        String option;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Do you want an overdraft:\n 1.Yes or 2.No");
        option = input.next();
        switch(option){
            case "1":
                this.overdraftLimit = 1000;
                break;
            case "Yes":
                this.overdraftLimit = 1000;
                break;
            case "yes":
                this.overdraftLimit =1000;
                break;
            case "2":
            this.overdraftLimit = 0;
            break;
            case "No":
                this.overdraftLimit =0;
                break;
            case "no":
                this.overdraftLimit =0;
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                this.getOverdraftLimit();
                System.out.println();
        }  
    }
    
    
    public double getOverdreaftLimit(){
        return this.overdraftLimit;
    }
    
    @Override
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("You have successfully deposited \n"
                + "an Overdraft of "+amount);
    }
    
    
    public void withdraw(double amount){
        if(this.getBalance()<amount || this.getBalance() ==0){
            if(this.overdraftLimit<(amount - this.getBalance())){
                System.out.println();
                System.out.println("You can't exceed the limit of your "
                        + "overdraft");
                System.out.println();
            } else {
                this.deposit(this.overdraftLimit);
                this.overdraftLimit =0; 
                super.withdraw(amount);
            } 
        } else {
            super.withdraw(amount);
        }
    }
    
    @Override 
    public String toString(){
        return "Account id is: " +this.getId()+"\n"
                +  "Account balance is: "+balance+"\n"
                + "The account was created on: "+this.getDateCreated()
                + "\nYour overdraft Limit is: "+this.overdraftLimit+"\n";
    }
    
}
