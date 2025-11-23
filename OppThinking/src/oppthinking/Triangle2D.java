/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;
    
    Triangle2D(){
        this.p1 = new MyPoint(0,0);
        this.p2 = new MyPoint(1,1);
        this.p3 = new MyPoint(2,5);
    }
    
    Triangle2D(MyPoint x, MyPoint y, MyPoint z){
        this.p1 = x;
        this.p2 = y;
        this.p3 = z;
    }
    
    public double getArea(){
        double s=0;
        double area=0;
        double a,b,c;
        //getting the distance between the points 
        a = this.p1.distance(p2);
        b = this.p2.distance(p3);
        c = this.p3.distance(p1);
        s = ( a+ b + c)/2;
        area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return area;
    }
   
    public double getPerimeter(){
        return (this.p1.distance(p2)+this.p2.distance(p3)+
                this.p3.distance(p1));
    }
    
    private boolean isVertexInTriangle(MyPoint p){
        double a,b,c,s;
        double area1,area2,area3;
        //finding the distance of pab
        a = p.distance(p1);
        b = this.p1.distance(p2);
        c =this.p2.distance(p);
        //finding semi perimeter  and area of pab
        s = (a+b+c)/2;
        area1 = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        
        //finding the distance of pbc
        a = p.distance(p2);
        b = this.p2.distance(p3);
        c = this.p3.distance(p);
        //finding semi perimeter and area of pbc
        s = (a+b+c)/2;
        area2 = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        
        //finding the distance of pca
        a = p.distance(p3);
        b = this.p3.distance(p1);
        c = this.p1.distance(p);
        //finding semi perimeter and area of pca
        s = (a+b+c)/2;
        area3 = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        
        //checking and returning if triangle contains stated point
         return Math.abs(this.getArea() - (area1 + area2 + area3)) < 1e-9;
    }
    
    public boolean contains(MyPoint p){
         return isVertexInTriangle( p);
    }
      
    public boolean contains(Triangle2D t){
        if(this.isVertexInTriangle(t.p1) 
                && this.isVertexInTriangle(t.p2) 
                &&this.isVertexInTriangle(t.p3)){
            return true;
        }
        return false;
    }
    private int[][] orientation(MyPoint p, MyPoint p1){
        int[][] value= new int[3][2];
        double x1,x2,x3,y1,y2,y3;
        
        x1 = this.p1.getx();
        x2 = this.p2.getx();
        x3 = p.getx();
        y1 = this.p1.gety();
        y2 = this.p2.gety();
        y3 = p.gety();
        value[0][0] =(int)(((y2-y1)*(x3-x2))-((x2-x1)*(y3-y2)));
        
        x1 = this.p1.getx();
        x2 = this.p2.getx();
        x3 = p1.getx();
        y1 = this.p1.gety();
        y2 = this.p2.gety();
        y3 = p1.gety();
        value[0][1] =(int)(((y2-y1)*(x3-x2))-((x2-x1)*(y3-y2)));
        
        x1 = this.p1.getx();
        x2 = this.p3.getx();
        x3 = p.getx();
        y1 = this.p1.gety();
        y2 = this.p3.gety();
        y3 = p.gety();
        value[1][0] =(int)(((y2-y1)*(x3-x2))-((x2-x1)*(y3-y2)));
        
        x1 = this.p1.getx();
        x2 = this.p3.getx();
        x3 = p1.getx();
        y1 = this.p1.gety();
        y2 = this.p3.gety();
        y3 = p1.gety();
        value[1][1] =(int)(((y2-y1)*(x3-x2))-((x2-x1)*(y3-y2)));
        
        
        x1 = this.p2.getx();
        x2 = this.p3.getx();
        x3 = p.getx();
        y1 = this.p2.gety();
        y2 = this.p3.gety();
        y3 = p.gety();
        value[2][0] =(int)(((y2-y1)*(x3-x2))-((x2-x1)*(y3-y2)));
        
        
        x1 = this.p2.getx();
        x2 = this.p3.getx();
        x3 = p1.getx();
        y1 = this.p2.gety();
        y2 = this.p3.gety();
        y3 = p1.gety();
        value[2][1] =(int)(((y2-y1)*(x3-x2))-((x2-x1)*(y3-y2))); 
        return value;
    }
    
    private boolean isRightlyOriented(int[][] arr){
        int len = arr.length;
        for (int i=0; i<len; i++){
            if( (arr[i][0]>0 && arr[i][1]<0) || (arr[i][0]<0 && arr[i][1]>0)){
                return true;
            } 
        }
        return false;
    }
    
    
    private boolean isIntersecting(Triangle2D t){
        int[][] orien, orien1, orien2;
        orien = this.orientation(t.p1, t.p2);
        orien1 = this.orientation(t.p1, t.p3);
        orien2 = this.orientation(t.p2, t.p3);
        
        if(this.isRightlyOriented(orien) || 
                this.isRightlyOriented(orien1) || 
                this.isRightlyOriented(orien2)){
            return true;
        }
        
        return false;
    }
    
    
    public boolean overlaps(Triangle2D t){
        if((this.contains(t.p1) || this.contains(t.p2) 
                || this.contains(t.p3)) || this.isIntersecting(t)){
            return true;
        }
        return false;
    }
}
