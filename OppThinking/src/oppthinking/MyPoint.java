
package oppthinking;
import javafx.geometry.Point2D;



public class MyPoint {
    private double x;
    private double y;
    Point2D p;
    
    MyPoint(){
        this(0,0);
    }
    
    MyPoint(double a, double b){
        this.x = a;
        this.y= b;
        p = new Point2D(a,b);
    }
    
    public double getx(){
        return x;
    }
    
    
    public double gety(){
        return y;
    }
    
    public double distance(MyPoint a){
        return p.distance(a.x,a.y);
    }
    
    
}
