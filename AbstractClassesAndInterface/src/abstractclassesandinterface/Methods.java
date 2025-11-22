/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author WIZBRAIN
 */
public class Methods {
    // instanceof is found in Abstract Classes at line 83
    
    
    
    public void GeometricObjects(){
        AbsGeometricObject geoObject1 = new Circle(5);
        AbsGeometricObject geoObject2 = new Rectangle(5.0, 3.0);
        System.out.println("The two objects have the same area: "+
                AbsGeometricObject.equalArea(geoObject1,geoObject2));
        AbsGeometricObject.displayGeometricObject(geoObject1);
        AbsGeometricObject.displayGeometricObject(geoObject2);
    }
    
    
    
    public static void testGetLargestNumber(){
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));
        System.out.println("The largest number is " +getLargestNumber(list));
    }
    
    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size() ==0)
            return null;
        
        Number number = list.get(0);
        for( int i=0; i<list.size(); i++){
            if(number.doubleValue() < list.get(i).doubleValue()){
                number = list.get(i);
            }
        }
        return number;
    }
    
    
    
    public static void calendarAndGregorianCalendar(){
        Calendar calendar = new GregorianCalendar();
        System.out.println("Date: "+new Date());
        System.out.println("YEAR: "+calendar.get(Calendar.YEAR));
        System.out.println("MONTH: "+calendar.get(Calendar.MONTH));
        System.out.println("WEEK: "+calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK: "+calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("DAY: "+calendar.get(Calendar.DATE));
        System.out.println("DAY: "+calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY: "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY: "+calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("HOUR: "+calendar.get(Calendar.HOUR));
        System.out.println("24 HOUR: "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTES: "+calendar.get(Calendar.MINUTE));
        System.out.println("SECONDS: "+calendar.get(Calendar.SECOND));
        System.out.println("MILLISECONDS: "+calendar.get(Calendar.MILLISECOND));
        System.out.println("AM/PM: "+calendar.get(Calendar.AM_PM));
        System.out.println("DAYS IN THE MONTH: "+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("TYPE: "+calendar.getCalendarType());
    }
    
    
    public static void absClasses(){
        Object[] obj = { new Tiger(), new Chicken(), new Apple()};
        for(int i=0; i<obj.length; i++){
            if(obj[i] instanceof Edible ){
                System.out.println(((Edible)obj[i]).howToEat());
            }
            
            if(obj[i] instanceof Animal){
               ((Animal)obj[i]).sound();
            }
        }
    }
    
    
    
    public static void comparableRectangle(){
        ComparableRectangle[] rectangles = {
            new ComparableRectangle(3.4, 5.4),
            new ComparableRectangle(13.24, 55.4),
            new ComparableRectangle(7.4, 35.4),
            new ComparableRectangle(1.4, 25.4)};
        
        java.util.Arrays.sort(rectangles);
        
        for(Rectangle rectangle: rectangles ){
            System.out.print(rectangle + "  \n");
            
        }
    }
    
    
    public static void Zoo(){
        Zoo zoo = new Zoo();
        Animal animal = new Chicken();
        Visitor visitor = new Visitor();
        Zookeeper keeper = new Zookeeper();
        zoo.addAnimal(animal);
        zoo.addZookeeper(keeper);
        zoo.addVisitor(visitor);
        zoo.visitors.get(0).watchAnimal(animal);
        zoo.animals.get(0).sound();
        zoo.visitors.get(0).listenToSound(animal);
        zoo.zookeepers.get(0).feed(animal);
        zoo.zookeepers.get(0).check(animal);
    }
    
    public static void Rational_(){
        Rational_ r1 = new Rational_(-2, 6);
        System.out.println(r1.getNumerator());
        System.out.println(r1.getDenominator());
        System.out.println(r1.intValue());
        System.out.println(r1.doubleValue());
    }
    
    public static void printCalendar_(){
        PrintCalendar_ cal = new PrintCalendar_();
        cal.getCalendar();
        cal.printDate();
    }
    
    public static void sumArea(){
        DecimalFormat format = new DecimalFormat("#.00");
        Octagon oct = new Octagon(5);
        Square sq = new Square(4);
        Square sq1 = new Square(3);
        Octagon oct1 = new Octagon(2);
        GeometricObject[] list = {oct,sq,sq1,oct1};
        double sum = Exercises.sumArea(list);
        System.out.println(format.format(sum));
    }
    
    public static void Course (){
        Course cs1 = new Course();
        cs1.addStudent("Kofi Kinaata");
        cs1.addStudent("Yaw Amega");
        cs1.addStudent("Kofi Yaw");
        cs1.addStudent("Amega Kinaata");
        cs1.addStudent("Yaa Asantewaa");
        System.out.println(cs1.getNumberOfStudents());
        cs1.getCourse(); 
    }
    public static void RationalArray(){
        RationalArray r1 = new RationalArray(-2, 6);
        System.out.println(r1.getNumerator());
        System.out.println(r1.getDenominator());
        System.out.println(r1.intValue());
        System.out.println(r1.doubleValue());
    }
    
    public static void RationalCalculator(){
        RationalCalculator cal = new RationalCalculator();
        cal.calculate();  
    }
}
