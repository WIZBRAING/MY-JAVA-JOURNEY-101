/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
/**
 *
 * @author WIZBRAIN
 */
public class Complex implements Comparable<Complex>, Cloneable {
    private long a;
    private long b;

    public Complex(){
        this(0,0);
    }
    
    public Complex(long a){
        this(a,0);
    }
    
    public Complex(long a, long b){
        this.a = a;
        this.b = b;
    }
    
   /* public void getFirstComplex(){
        System.out.print("Enter the first complex number: ");
        input();
    }
    
    public void getSecondComplex(){
        System.out.print("Enter the second complex number: ");
        input();
    } */
    
    public long getRealPart(){
        return this.a;
    }
    
    public long getImaginaryPart(){
        return this.b;
    }
    
    public Complex add(Complex o){
        long x =this.a +o.a;
        long y = this.b +o.b;
        return new Complex(x,y);
    }
    
    public Complex subtract(Complex o){
        long x =this.a -o.a;
        long y = this.b -o.b;
        return new Complex(x,y);
    }
    
    public Complex multiply(Complex o){
        long x =(this.a *o.a)-(this.b*o.b);
        long y = (this.b *o.a)+(this.a*o.b);
        return new Complex(x,y);
    }
    
    public Complex divide(Complex o){
        long x =((this.a *o.a)+(this.b*o.b))/(long)(Math.pow(o.a, 2)+
                Math.pow(o.b, 2));
        long y = ((this.b *o.a)+(this.a*o.b))/(long)(Math.pow(o.a, 2)+
                Math.pow(o.b, 2));
        
        return new Complex(x,y);
    }
    
    public long abs(){
        return (long)Math.sqrt((Math.pow(this.a, 2)+ 
                Math.pow(this.b, 2)));
    }
    
    private void input(String message){
        System.out.print(message);
        java.util.Scanner input = new java.util.Scanner(System.in);
        a = input.nextLong();
        b = input.nextLong();
        input.close();
    }
    
    @Override 
    public Complex clone()throws CloneNotSupportedException{
        return (Complex) super.clone();
    }
    
    @Override
    public int compareTo(Complex o){
        
        return 0;
    }
    
    @Override 
    public String toString(){
        if(this.b ==0){
            return this.a+"";
        } else 
            return "("+a+" + "+b+"i)";
    }
}
