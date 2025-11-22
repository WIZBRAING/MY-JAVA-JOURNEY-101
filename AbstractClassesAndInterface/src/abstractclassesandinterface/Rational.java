/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class Rational extends Number implements Comparable<Rational> {
    
    private long numberator=0;
    private long denominator=1;
    
    public Rational(){
        this(0,1);
    }
    
    
    public Rational(long numerator, long denominator){
        long gcd = gcd(numerator, denominator);
        this.numberator = ((denominator>0)? 1:-1) * numerator/gcd;
        this.denominator = Math.abs(denominator)/gcd;
    }
    
    
    public long getNumerator(){
        return this.numberator;
    }
    
    
    public long getDenominator(){
        return this.denominator;
    }
    
    
    public Rational add(Rational secondRational){
        long n = (this.numberator * secondRational.getDenominator())+ 
                (this.denominator *secondRational.getNumerator());
        
        long d = this.denominator * secondRational.getDenominator();
        
        return new Rational(n,d);
    }
    
    
    public Rational subtract(Rational secondRational){
        long n = (this.numberator*secondRational.getDenominator())-
                (this.denominator *secondRational.getNumerator());
        
        long d = this.denominator * secondRational.getDenominator();
        
        return new Rational(n,d);
    }
    
    
    public Rational multiply(Rational secondRational){
        long n = this.numberator * secondRational.getNumerator();
        
        long d = this.denominator * secondRational.getDenominator();
        
        return new Rational(n,d);
    }
    
    
    public Rational divide(Rational secondRational){
        long n = this.numberator * secondRational.getDenominator();
        
        long d = this.denominator * secondRational.getNumerator();
        
        return new Rational(n,d);
    }
    
    
    private static long gcd(long n, long d){
        long n0 = Math.abs(n);
        long n1 = Math.abs(d);
        int gcd =1;
        for(int i=1; i<n0 && i<n1 ; i++){
            if(n1%i==0 && n%i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
    
    
    @Override 
    public String toString(){
        if(this.denominator == 0)
            return this.getNumerator()+"";
        else 
            return (this.getNumerator()+"/"+this.getDenominator());
    }
    
    
    @Override 
    public int intValue(){
        return (int)doubleValue();
    }
    
    
    @Override 
    public float floatValue(){
        return (float)doubleValue();
    }
    
    
    @Override 
    public double doubleValue(){
        return this.getNumerator()* 1.0 /  this.getDenominator();
    }
    
    
    @Override 
    public long longValue(){
        return (long)doubleValue();
    }
    
    
    @Override
    public int compareTo(Rational o){
        if(this.subtract(o).getNumerator()>0)
            return 1;
        else if(this.subtract(o).getNumerator()<0)
            return -1;
        else
            return 0;
    }
     
    
}
