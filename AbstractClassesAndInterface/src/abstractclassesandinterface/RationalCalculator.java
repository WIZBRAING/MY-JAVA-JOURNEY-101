/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class RationalCalculator {
    private String[] operand1;
    private String   operator;
    private String[] operand2;
    //private Rational rational;
    
    public RationalCalculator(){
        this.operand1 = new String[2];
        this.operand2 = new String[this.operand1.length];
        this.operator = "";
    }
    
    
    public void calculate(){
        String value = this.input();
        this.splitString(value);
        
         Rational r1 = new Rational(Integer.parseInt(operand1[0]),
                        Integer.parseInt(operand1[1]));
         
         Rational r2 = new Rational(Integer.parseInt(operand2[0]),
                        Integer.parseInt(operand2[1]));
         
         switch(this.operator){
             case "+":
                 System.out.println(r1+"+"+r1+" = "+this.add(r1, r2));
                 break;
                 
             case "-":
                 System.out.println(r1+" - "+r1+" = "+this.subtract(r1, r2));
                 break;
                 
             case "*":
                 System.out.println(r1+" * "+r1+" = "+this.multiply(r1, r2));
                 break;
                 
             case "/":
                 System.out.println(r1+" / "+r1+" = "+this.divide(r1, r2));
                 break;
                 
             default:
                 System.out.println("Invalid operator");
         }
         
    }
    
    
    private String input(){
        System.out.println("Enter your Expresion eg: 1/2 + 2/3");
        String value =new java.util.Scanner(System.in).nextLine();
        return value;
    }
    
    
    private void splitString(String value){
       
        String[] token = value.split("(?<=[*+-/])|(?=[*-+/])");
         this.operand1[0] = token[0].trim();
          this.operand1[1] = token[2].trim();
           this.operator = token[3].trim();
            this.operand2[0] = token[4].trim();
             this.operand2[1] = token[token.length-1].trim();

    }
    
    
    private String add(Rational o, Rational ob){
        return o.add(ob).toString();
    }
    
    
    private String subtract(Rational o, Rational ob){
       return  o.subtract(ob).toString();
    }
    
    
    private String divide(Rational o, Rational ob){
         return o.divide(ob).toString();
    }
    
    
    private String multiply(Rational o, Rational ob){
        return o.multiply(ob).toString();
    }
    
}
