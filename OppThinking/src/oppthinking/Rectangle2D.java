/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class Rectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;
    
    Rectangle2D(){
        this(0,0,1,1);
    }
    
    Rectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setHeight(double heigth){
        this.height = heigth;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getArea(){
        return (this.width * this.height);
    }
    
    public double getPerimeter(){
        return (this.width*2)+(this.height*2);
    }
    
    private double[][] boundary(Rectangle2D r){
       return boundary(r.getX(), r.getY(), 
               r.getWidth(),r.getHeight());
    }
    
    private double[][] boundary(double x, double y, double width, double height){
        double[][]  bound= new double[2][2];
        bound[0][0] = x - (width/2);
        bound[0][1] = x + (width/2);
        
        bound[1][0] = y-(height/2);
        bound[1][1] = y+(height/2);
        
        return bound;
    }
    
    private double[][] boundary(){
       return this.boundary(this.x,this.y,
               this.width,this.height);
    }
    
    private boolean isInBoundary(Rectangle2D r){
        double[][] R1 = boundary();
        double[][] R2 = this.boundary(r);
        double r1MinX = R1[0][0];
        double r1MaxX = R1[0][1];
        double r1MinY = R1[1][0];
        double r1MaxY = R1[1][1];
        
        double r2MinX = R2[0][0];
        double r2MaxX = R2[0][1];
        double r2MinY = R2[1][0];
        double r2MaxY = R2[1][1];
        
        /*if(((r1MinX<r2MinX & r2MinX<r1MaxX)&(r1MinX<r2MaxX & r2MaxX<r1MaxX))
                &((r1MinY<r2MinY & r2MinY<r1MaxY)&
                (r1MinY<r2MaxY & r2MaxY<r1MaxY))){
            return true;
        } */
        if (r2MinX >= r1MinX && r2MaxX <= r1MaxX && r2MinY >= r1MinY 
                && r2MaxY <= r1MaxY) {
            return true;
       }

        return false;
    }
    
    private boolean isInBoundary(double cx,double cy){
        double[][] bound = boundary();
        if((bound[0][0]<= cx & cx<=bound[0][1]) 
                & (bound[1][0]<=cy & cy<=bound[1][1])){
            return true;
        }
        return false;
    }
    
        private boolean isOverlap(Rectangle2D r){
        double[][] R1 = boundary();
        double[][] R2 = this.boundary(r);
        double r1MinX = R1[0][0];
        double r1MaxX = R1[0][1];
        double r1MinY = R1[1][0];
        double r1MaxY = R1[1][1];
        
        double r2MinX = R2[0][0];
        double r2MaxX = R2[0][1];
        double r2MinY = R2[1][0];
        double r2MaxY = R2[1][1];
        
        if(((r1MinX<r2MaxX)&(r1MaxX>r2MinX))&((r1MinY<r2MaxY)&(r1MaxY>r2MinY))){
            return true;
        }
        return false;
    }
    
   
    public boolean contains(double a, double b){
        if(this.isInBoundary(a,b))
            return true;
        return false;
    }
    
    public boolean contains(Rectangle2D r){
        if(this.isInBoundary(r))
            return true;
        return false;
    }
    
    public boolean overlaps(Rectangle2D r){
        if(this.isOverlap(r))
            return true;
        return false;
    }
    
    //Make sure you solve this the next time your learning java 
    public boolean touches(Rectangle2D r){
        return false;
    }
            
}
