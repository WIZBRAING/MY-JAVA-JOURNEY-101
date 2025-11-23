/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class Account_ extends Account {
    private String custName;
    java.util.ArrayList<Transactions> transaction;
    
    public Account_(){
        
    }
    
    public Account_(String name,int id, double bal, double intRate){
        super(id,bal,intRate);
        this.custName = name;
        this.transaction = new java.util.ArrayList<>();
    }
    
    public Account_(String name, int id, double bal){
        super(id,bal);
        this.custName = name;
         this.transaction = new java.util.ArrayList<>();
    }
    
    public String getCustomerName(){
        return this.custName;
    }
    
    public void setCustomerName(String name){
        this.custName = name;
    }
    
    @Override 
    public void withdraw(double amount){
        if(this.getBalance()<amount || this.getBalance()==0){
            System.out.println("Invalid Withdrawal");
        } else {
            super.withdraw(amount);
            this.transaction.add(new Transactions('W',amount,
                    this.getBalance(), "Successful withdrawal of "+amount+
                            "\nRemaining balance is "+(this.getBalance())));
            System.out.println();
        }
    }
    
    @Override 
    public void deposit( double amount){
        if(amount > 0){
            super.deposit(amount);
            System.out.println("Your new balance is: "+this.getBalance()+"\n");
            this.transaction.add(new Transactions('D',amount,
                    this.getBalance(), "Successful Deposit of "+amount+
                            "\nCurrent balance is "+getBalance()));
        }
    }
    
    public void printSummary(){
        System.out.println();
        System.out.println("ACCOUNT SUMMARY");
        System.out.println("----------------");
        System.out.println(this.custName);
        System.out.println("Interest Rate: "+this.getAnnualInterestRate());
        System.out.println("Balance: "+this.balance);
        for(Transactions t: transaction){
            System.out.println("Transaction type: "+t.getType()+"\n"
                    + "Amount: "+t.getAmount()+"\n"
                            + "Balance: "+t.getBalance()+"\n"
                                    + "Decription: "+t.getDescription()+""
                                            + "\nDate: "+t.getDate());
            System.out.println();
        }
    }
    
    
}
