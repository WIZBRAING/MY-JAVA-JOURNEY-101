/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

/**
 *
 * @author WIZBRAIN
 */
public class RationalArray extends Number implements Comparable<RationalArray>{
    private long[] r;
    
    public RationalArray(long numerator, long denominator){
        int gcd = this.gcd(numerator,denominator);
        this.r = new long[2];
        this.r[0] = ((denominator>0)? 1:-1)*numerator/gcd;
        this.r[1] = Math.abs(denominator/gcd);
    }
    
    public RationalArray(){
        this(1,1);
    }
    
    public long getNumerator(){
        return this.r[0];
    }
    
    public long getDenominator(){
        return this.r[1];
    }
    
    public RationalArray add(RationalArray o){
        long num = (this.r[0] * o.r[1])+(this.r[1]*o.r[0]);
        long den = this.r[1] * o.r[1];
        return new RationalArray(num,den);
    }
    
    public RationalArray subtract(RationalArray o){
        long num = (this.r[0] * o.r[1])-(this.r[1]*o.r[0]);
        long den = this.r[1] * o.r[1];
        return new RationalArray(num,den);
    }
    
    public RationalArray multiply(RationalArray o){
        long num = (this.r[0] * o.r[0]);
        long den = this.r[1] * o.r[1];
        return new RationalArray(num,den);  
    }
    
    public RationalArray divide(RationalArray o){
        long num = (this.r[0] * o.r[1]);
        long den = this.r[1] * o.r[0];
        return new RationalArray(num,den); 
    }
    
    public int gcd(long numerator, long denominator){
        int gcd =1;
        long num = Math.abs(numerator);
        long den = Math.abs(denominator);
        for(int i=1; i<num && i<den; i++){
            if(num%i==0 && den%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    
    @Override 
    public String toString(){
        return this.r[0]+"/"+this.r[1];
    }
    
    @Override 
    public int compareTo(RationalArray o){
        if(this.subtract(o).getNumerator() > 0){
            return 1;
        } else if(this.subtract(o).getNumerator() < 0){
            return -1;
        } else 
            return 0;
    }
    
    @Override
    public boolean equals(Object o){
        if(this.subtract((RationalArray)o).getNumerator() ==0){
            return true;
        } else 
            return false;
    }
    
    @Override
    public double doubleValue(){
        return this.getNumerator()*1.0/this.getDenominator();
    }
    
    @Override
    public float floatValue(){
        return (float)doubleValue();
    }
    
    @Override
    public int intValue(){
        return (int)doubleValue();
    }
    
    @Override
    public long longValue(){
        return (long)doubleValue();
    }
    
}
