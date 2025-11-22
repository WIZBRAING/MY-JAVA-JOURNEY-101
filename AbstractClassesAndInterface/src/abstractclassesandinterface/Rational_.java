/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.math.BigInteger;
/**
 *
 * @author WIZBRAIN
 */
public class Rational_ extends Number implements Comparable<Rational_> {
    private BigInteger numerator;
    private BigInteger denominator;
    
    public Rational_(){
        this(0,1);
    }
    
    public Rational_(long n, long d){
        int gcd = gcd(n,d);
        this.numerator = BigInteger.valueOf((((d>0)? 1:-1)*n/gcd));
        this.denominator = BigInteger.valueOf(d/gcd);
    }
    
    public Rational_(BigInteger n, BigInteger d){
        int gcd = gcd (n.longValue(),d.longValue());
        this.numerator = n;
        this.denominator = d;
    }

    public BigInteger getNumerator(){
        return this.numerator;
    }
    
    
    public BigInteger getDenominator(){
        return this.denominator;
    }
    
    
    public Rational_ add(Rational rational){
        BigInteger n = (this.numerator.multiply(BigInteger.valueOf(
                rational.getDenominator()))).add(
                        this.denominator.multiply(BigInteger.valueOf(
                                rational.getNumerator())));
        
        BigInteger d = this.denominator.multiply(BigInteger.valueOf(
                rational.getDenominator()));
               
        return new Rational_
        (n,d);                 
    }
    
    
    public Rational_ subtract(Rational_ rational){
        BigInteger n = (this.numerator.multiply(rational.getDenominator()
                        )).subtract(this.denominator.multiply(
                                rational.getNumerator()));
        BigInteger d = this.denominator.multiply(rational.getDenominator());
        
        return new Rational_(n.longValue(), d.longValue());
        
    }
    
    
    public Rational_ multiply(Rational_ rational){
        BigInteger n = this.numerator.multiply(rational.getNumerator());
        BigInteger d = this.denominator.multiply(rational.getDenominator());
        
        return new Rational_(n.longValue(),d.longValue());
    }
    
    
    public Rational_ divide(Rational_ rational){
        BigInteger n = this.numerator.multiply(rational.getDenominator());
        BigInteger d = this.denominator.multiply(rational.getNumerator());
        
        return new Rational_(n.longValue(),d.longValue());
    }
    
    private static int gcd(long n, long d){
        long n0 = Math.abs(n);
        long n1 = Math.abs(d);
        int gcd = 1;
        for(int i=1; i<n0 && i<n1; i++){
            if(n0%i == 0 && n1%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    
    @Override
    public String toString(){
        return this.numerator +"/"+this.denominator;
    }
    
    @Override 
    public double doubleValue(){
        double value = this.numerator.doubleValue()/
                        this.denominator.doubleValue();
        return value;
    }
    
    @Override 
    public float floatValue(){
        return (float) doubleValue();
    }
    
    @Override 
    public long longValue(){
        return (long)doubleValue();
    }
    
    @Override 
    public int intValue(){
        return (int)doubleValue();
    }
    
    @Override 
    public boolean equals(Object o){
        if(!(o instanceof Rational_)){
            return false;
        }
        else 
            if(this.subtract((Rational_)o).getNumerator().longValue() ==0)
                return true;
            else 
                return false;
    }
    @Override
    public int compareTo(Rational_ rational){
        if(this.subtract(rational).getNumerator().longValue() > 0)
            return 1;
        else if(this.subtract(rational).getNumerator().longValue()<0)
            return -1;
        else 
            return 0;
    }
     

    
}
