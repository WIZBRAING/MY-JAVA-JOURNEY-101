/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class MyRectangle2D {
    private double x;
    private double y;
    private double height;
    private double width;
    
    MyRectangle2D(){
        this(0,0,1,1);
    }
    
    MyRectangle2D(double x, double y, double w, double h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void setWidth(double w){
        this.width = w;
    }
    
    public void setHeight(double h){
        this.height = h;
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
       return 2 * (this.width + this.height);
    }
    
    private double[][] getBounds(Rectangle2D r){
        double[][] ar = new double[2][2];
        ar[0][0] = r.getX()- r.getWidth()/2;
        ar[0][1] = r.getX() + r.getWidth()/2;
        ar[1][0] = r.getY() - r.getHeight()/2;
        ar[1][1] = r.getY() + r.getHeight()/2;
        
        return ar;
    }
    
    private double[][] getBounds(MyRectangle2D r){
        double[][] ar = new double[2][2];
        ar[0][0] = r.getX()- r.getWidth()/2;
        ar[0][1] = r.getX() + r.getWidth()/2;
        ar[1][0] = r.getY() - r.getHeight()/2;
        ar[1][1] = r.getY() + r.getHeight()/2;
        
        return ar;
    }
  
    private double[][] getBounds(){
        double[][] ar = new double[2][2];
        ar[0][0] = this.getX()- this.getWidth()/2;
        ar[0][1] = this.getX() + this.getWidth()/2;
        ar[1][0] = this.getY() - this.getHeight()/2;
        ar[1][1] = this.getY() + this.getHeight()/2;
        
        return ar;
    }
    public boolean contains(double x, double y){
          double[][] ar = this.getBounds();
          return((ar[0][0]<= x && x <= ar[0][1])&&(ar[1][0]<=y && 
                  y<=ar[1][1]));
    }
    
    public boolean contains(MyPoint p){
          double[][] ar = this.getBounds();
          return((ar[0][0]<= p.getx() && p.getx() <= ar[0][1])&&
                  (ar[1][0]<=p.gety() && p.gety()<=ar[1][1]));
    }
    
    public boolean contains(MyPoint ...numbers){
        boolean isIn = true;
        for(int i=0; i<numbers.length; i++){
            if(!contains(numbers[i])){
                isIn  = false;
                break;
            }
        }
        return isIn;
    }
    public boolean contains(Rectangle2D r){
        double[][] R1 = this.getBounds();
        double[][] R2 = this.getBounds(r);
        
        //getting R1 min and max coordinates
        double minXR1 = R1[0][0];
        double maxXR1 = R1[0][1];
        double minYR1 = R1[1][0];
        double maxYR1 = R1[1][1];
        
        //getting R2 min and max coordinates 
        double minXR2 = R2[0][0];
        double maxXR2 = R2[0][1];
        double minYR2 = R2[1][0];
        double maxYR2 = R2[1][1];
        
        return (minXR2>=minXR1 && maxXR2 <= maxXR1 && minYR2 >= minYR1 
                && maxYR2 <= maxYR1);

    }
    
    public boolean contains(MyRectangle2D r){
        double[][] R1 = this.getBounds();
        double[][] R2 = this.getBounds(r);
        
        //getting R1 min and max coordinates
        double minXR1 = R1[0][0];
        double maxXR1 = R1[0][1];
        double minYR1 = R1[1][0];
        double maxYR1 = R1[1][1];
        
        //getting R2 min and max coordinates 
        double minXR2 = R2[0][0];
        double maxXR2 = R2[0][1];
        double minYR2 = R2[1][0];
        double maxYR2 = R2[1][1];
        
        return (minXR2>=minXR1 && maxXR2 <= maxXR1 && minYR2 >= minYR1 
                && maxYR2 <= maxYR1);

    }
    
    public boolean overlaps(Rectangle2D r){
        double[][] R1 = this.getBounds();
        double[][] R2 = this.getBounds(r);
        
        //getting R1 min and max coordinates
        double minXR1 = R1[0][0];
        double maxXR1 = R1[0][1];
        double minYR1 = R1[1][0];
        double maxYR1 = R1[1][1];
        
        //getting R2 min and max coordinates 
        double minXR2 = R2[0][0];
        double maxXR2 = R2[0][1];
        double minYR2 = R2[1][0];
        double maxYR2 = R2[1][1];
        
        return (minXR1 < maxXR2 && maxXR1>minXR2 && minYR1<maxYR2 &&
                maxYR1>minYR2); 
    }
    
    public boolean overlaps(MyRectangle2D r){
        double[][] R1 = this.getBounds();
        double[][] R2 = this.getBounds(r);
        
        //getting R1 min and max coordinates
        double minXR1 = R1[0][0];
        double maxXR1 = R1[0][1];
        double minYR1 = R1[1][0];
        double maxYR1 = R1[1][1];
        
        //getting R2 min and max coordinates 
        double minXR2 = R2[0][0];
        double maxXR2 = R2[0][1];
        double minYR2 = R2[1][0];
        double maxYR2 = R2[1][1];
        
        return (minXR1 < maxXR2 && maxXR1>minXR2 && minYR1<maxYR2 &&
                maxYR1>minYR2); 
    }
}
