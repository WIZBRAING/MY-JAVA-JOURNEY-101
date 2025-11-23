/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;
import java.util.GregorianCalendar;
/**
 *
 * @author WIZBRAIN
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    private GregorianCalendar calendar;
    
    
    MyDate(){
        calendar = new GregorianCalendar();
        this.year = this.calendar.get(calendar.YEAR);
        this.month = this.calendar.get(calendar.MONTH);
        this.day = this.calendar.get(calendar.DAY_OF_MONTH);
    }
    
    
    MyDate(long ts){
        this();
        this.calendar.setTimeInMillis(ts);
        this.year = this.calendar.get(calendar.YEAR);
        this.month = this.calendar.get(calendar.MONTH);
        this.day = this.calendar.get(calendar.DAY_OF_MONTH);
    }
    
    
    MyDate(int y,int m, int d){
        this.calendar = new GregorianCalendar(y,m,d);
        this.year = y;
        this.month = m;
        this.day = d;
    }
    
    public int getYear(){
       return this.year;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getDay(){
        return this.day;
    }
    
    public void setDate(long ts){
        this.calendar.setTimeInMillis(ts);
        this.year = this.calendar.get(calendar.YEAR);
        this.month = this.calendar.get(calendar.MONTH);
        this.day = this.calendar.get(calendar.DAY_OF_MONTH);
    }
}
