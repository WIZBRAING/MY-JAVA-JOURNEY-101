/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class ATM {
    private Account[] ac;
    private int id;
    ATM(){
        this.createAccount();
    }
    private void createAccount(){
        this.ac = new Account[10];
        for (int i=0; i<ac.length;i++){
            ac[i] = new Account(i,100,0);
        }
        
        this.atmApp();
    }
    
    private void atmApp(){
        this.menu();
    }
    
    private void menu(){
        this.acceptId();
        if ( this.id >=0 && this.id <=9){
            this.mainMenu();
        } else {
            System.out.println("Invalid id. Please enter\n a correct id.\n");
            this.atmApp();
        }
    }
    
    private void mainMenu(){
            System.out.println("\nMain Menu");
            checkOptions();
    }
    
    private int acceptId(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter an id: ");
        this.id = input.nextInt(); 
        return id;
    }
    private void checkOptions(){
        switch(this.options()){
            case 1:
                this.checkBalance();
                break;
            case 2:
                this.withdraw();
                break;
            case 3:
                this.deposit();
                break;
            case 4:  
                System.out.println();
                this.atmApp();
                break;
        }
    }

    
    private int options(){
        int choice;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
        System.out.println("Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }
    

    
    private void checkBalance(){
                System.out.println("Your current balance is: "+
                        this.ac[this.id].getBalance()); 
                this.mainMenu();
    }
    
    private void withdraw(){
                double amount;
                java.util.Scanner input = new java.util.Scanner(System.in);
                System.out.print("Enter the amount \nto withdraw:..");
                amount = input.nextDouble();
                this.ac[this.id].withdraw(amount);
                this.mainMenu();
    }
    
    private void deposit(){
        int amount;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the amount to deposit:..");
        amount = input.nextInt();
        this.ac[this.id].deposit(amount);
        this.mainMenu();
    }
}
