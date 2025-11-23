package classes;
import java.util.Scanner;
import java.util.Random;


//import java.util.Date;
import javafx.geometry.Point2D;
public class Classes {
    public static void main(String[] args) {
      ////////////// TODO code application logic here
      Random rand = new Random(2);
      for (int i=0; i<10;i++){
          System.out.printf("%-5d", rand.nextInt(100));
      }


      

      
      
    }/////////////End of main 
    
    
    //checking the time elapse for the sorting 
    public static void elapseSortTime() {

        //creating double array
        double[] arr = new double[10000];
        
        //initailzing the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (1 + Math.random() * 100);
            System.out.printf("%-7.2f\n", arr[i]);
        }
        
        //creating an instance from Stopwatch class
        Stopwatch watch = new Stopwatch();      
        //calling selection sort to sort values
        selectionSort(arr, 0, arr.length);
        //stoping timer
        watch.stop();
        //printing out the toal elapse time for the sorting
        System.out.println("The elapse time is: " + watch.getElapseTime());
        //printing the sorted array
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //Selection sort
    public static void selectionSort(double[] list, int low, int high){

        if(low<high){
            int minIndex = low;
            double min = list[low];
            
            for (int i=low+1; i<high;i++){
                if(min>list[i]){
                    minIndex = i;
                    min = list[i];
                }
            }
            
            list[minIndex] = list[low];
            list[low] = min;
            
            selectionSort(list, low+1,high);
        }
    }
    //GregorianCalender
    public static void greCal(){
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        System.out.println(gc.get(gc.DAY_OF_MONTH));
        System.out.println(1+gc.get(+(gc.MONTH)));
        System.out.println(gc.get(gc.YEAR));
        
        //Setting time to 1234567898765L
        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(gc.DAY_OF_MONTH));
        System.out.println(1+gc.get(gc.MONTH));
        System.out.println(gc.get(gc.YEAR));
        System.out.println(gc.getTime());
        
        
    }
    
    //Using Random class 
    public static void printRand(){
        java.util.Random  rand = new java.util.Random(1000);
        for( int i=1; i<=50;i++){
            System.out.print(rand.nextInt(100)+" ");
            if (i%10==0){
                System.out.println();
            }
                
        }
    }
    
    //Using the Date class to create date objects
    public static void printDate(){
        java.util.Date[] date = new java.util.Date[8];
        int value = 10000;
        for (int i=0; i<date.length;i++){
            date[i] = new java.util.Date(value);
            value *=10;  
        }
        for (int i=0; i<date.length;i++){
            System.out.println(date[i].toString());
        }
    }
    //Stock
    public static void stock_() {
        Stock stock;
        stock = new Stock("ORCL", "Oracle Cooperation");
        stock.setCurPrice(34.5);
        stock.setPrePrice(34.35);
        stock.dispChangePercen();
    }
    
    //creating array of objects;
    public static circle[] createCircArray(){
        circle[] a = new circle[5];
        for (int i=0; i<a.length; i++){
            a[i] = new circle(Math.random() * 100);
        }
        return a;
    }
    
    //printing object's array value 
    public static void printCircArray(circle[] a){
        System.out.printf("%-30s %-15s\n","Radius","Area");
        for (circle a1 : a) {
            System.out.printf("%-30f%-15f\n", a1.getRadius(), a1.getArea());
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-30s%-15f\n","The toal area of the circle is ", sumCircArray(a));
    }
  
    public static double sumCircArray(circle[] a){
        double sum =0;
        for (circle a1 : a) {
            sum += a1.getArea();
        }
        return sum;
    }
    
    //Swap Circles
    public static void swap(){
                circle c1 = new circle(1);
        circle c2 = new circle(2);
        
        circle.swap1(c1,c2);
      System.out.println("After swap1: circle1 = " + 
      c1.radius + " circle2 = " + c2.radius);
        circle.swap2(c1, c2);
        
      System.out.println("After swap2: circle1 = " + 
      c1.radius + " circle2 = " + c2.radius);

        
        
    }
    
    //POINT 2D
    public static void point2D_(){
        double p1x,p1y,p2x,p2y;
        Point2D p1,p2;
        Scanner input = new Scanner(System.in);
        
        //initializing p1 wiht input
        System.out.println("Enter point 1's x and y coordinates:");
        p1x = input.nextDouble();
        p1y = input.nextDouble();
        p1 = new Point2D(p1x,p1y);
        
        //initializing p2 with input
        System.out.println("Enter Point 2's x and y coordinate:");
        p2x = input.nextDouble();
        p2y = input.nextDouble();
        p2 = new Point2D(p2x,p2y);
        
        //displaying p1 and p2 value and finding distance between
        System.out.println("P1 is: "+p1.toString());
        System.out.println("p2 is: "+p2.toString());
        System.out.println("The distance between P1 and P2 is: "+p1.distance(p2));
        
    }
    
    //
    public static void rand_n_Date(){
                int[] arr = new int[5];
        Random ran = new Random();
        java.util.Date date = new java.util.Date("08/31/1997 08:45:23");
        for (int i=0; i<arr.length;i++){
            arr[i] = ran.nextInt(5);
            System.out.println(date.getMinutes());
            System.out.println(date.getHours());
            System.out.println(date.getDay()+1);
            System.out.println(date.getMonth()+1);
            System.out.println(date.getYear());
            System.out.println(date.getTime());
            System.out.println(arr[i]);
            System.out.println(date.toString());
        }
    }
    public static void printAray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array you want to create");
        int size = input.nextInt();
        int[] aray = arr(size);
        for (int e : aray) {
            System.out.print(e + " ");
        }

        
        System.out.println();

    }

    public static int[] arr(int a) {
        int[] aray = new int[a];
        for (int i = 0; i < aray.length; i++) {

            aray[i] = (int) (1 + Math.random() * 101);
        }
        return aray;
    }

}

