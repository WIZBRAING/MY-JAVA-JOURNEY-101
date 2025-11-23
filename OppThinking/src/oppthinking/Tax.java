/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class Tax {
    //private variables
  private int fillingStatus;
  private int[][] brackets;
  private double[] rates;
  private double taxableIncome;
  
  //Public constant variables;
  public static final int SINGLE_FILLER=0;
  public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW =1;
  public static final int MARRIED_SEPARATELY =2;
  public static final int HEAD_OF_HOUSEHOLD =3;
  
  
  Tax(){
      this.fillingStatus = this.SINGLE_FILLER;
      this.brackets = new int[4][5];
      this.rates = new double[6];
      this.taxableIncome = 0.0;
  }
  
  Tax(int fillingStatus, int[][] bracket, double[] rate, double taxedIncome){
      this.fillingStatus = fillingStatus;
      this.brackets = bracket;
      this.rates = rate;
      this.taxableIncome = taxedIncome;
      
  }
  
  public void setFillingStatus(int value){
      this.fillingStatus = value;
  }
  
  public void setBrackets(int[][] value){
      this.brackets = value;
  }
  
  public void setRate(double[] value){
      
  }
  
  public void setTaxableIncome(double value){
      this.taxableIncome = value;
  }
  
  public int getFillingStatus(){
      return this.fillingStatus;
  }
  
  public int[][] getBrackets(){
      return this.brackets;
  }
  
  public double[] getRates(){
      return this.rates;
  }
  
  public double getTaxableIncome(){
      return this.taxableIncome;
  }
  
  public double getTax(){
      //tax variable to store tax
      double tax = 0;
      //pl variable to store the highest value from the privious values;
      double previousLimit=0;
      //picking a row from multidimensional array brackets to initialize 
      //single dimensional array bracket
      int bracket[] = this.brackets[this.fillingStatus];
      //iterating over the full array to get tax
      for (int i=0; i<bracket.length;i++){
          //comparing income with the values in each segment of the array 
          if(this.taxableIncome>bracket[i]){
              tax  += ((bracket[i]-previousLimit)*this.rates[i]);
              previousLimit = bracket[i];
          } else {
              tax += ((bracket[i]-previousLimit)*this.rates[i]);
              return tax;
          }
      }
          tax += ((this.taxableIncome-previousLimit)*this.rates[this.rates.length]);
                return tax;
  }
}
