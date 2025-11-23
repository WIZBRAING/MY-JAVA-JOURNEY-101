/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author WIZBRAIN
 */
public class Stock {
    String symbol, name;
    double pPrice, cPrice;
    
    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
        this.pPrice = 0;
        this.cPrice = 0;
    }
    
    public void setCurPrice(double price){
        this.cPrice = price;
    }
    
    public void setPrePrice(double price){
        this.pPrice = price;
    }
    
    public double getChangePercent(){
        double sum=this.cPrice +this.pPrice;
        double change=(this.cPrice - this.pPrice);
        double changePercent=(change/sum)*100;
        return changePercent;
    }
    
    public void dispChangePercen(){
        System.out.println(this.getChangePercent()+"%");
    }
    
}
