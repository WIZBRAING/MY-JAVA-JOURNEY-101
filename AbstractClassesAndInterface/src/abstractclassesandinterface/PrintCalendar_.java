/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.lang.Cloneable;
import java.lang.CloneNotSupportedException;
/**
 *
 * @author WIZBRAIN
 */
public class PrintCalendar_ implements Cloneable{
    private java.util.Calendar calendar;
    private static final String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri",
                                            "Sat"};
    private static final String[] months = {"January","February","March","April",
                                            "May","June","July","August",
                                            "Semptember","October","November",
                                            "December"};
    
    public PrintCalendar_(){
        this.calendar =new  java.util.GregorianCalendar();
    }
    
    public PrintCalendar_(int year, int month,int day){
        this();
        this.calendar.set(this.calendar.YEAR,year);
        this.calendar.set(this.calendar.MONTH,month);
        this.calendar.set(this.calendar.DAY_OF_MONTH, day);
    }
    
    public PrintCalendar_(int year, int month){
        this(month);
        this.calendar.set(this.calendar.YEAR, year);
    }

    public PrintCalendar_(int month){
        this();
        this.calendar.set(this.calendar.MONTH, month);
    }
    
    public void getCalendar(){
        this.getHead();
        this.getBody();
    }
    
    public void getHead(){
        for(int i=0; i<5; i++){
            System.out.print(" ");
        }
        
        System.out.println("   "+months[this.getMonth()]+", "+this.getYear());
        
        for(int i=0; i<32; i++){
            System.out.print("-");
            if(i==31){
                System.out.println();
            }
        }
          
        for(int i=0; i<PrintCalendar_.days.length; i++){
            System.out.printf("%-5s", days[i]);
            if(i==PrintCalendar_.days.length-1){
                System.out.println();
            }
        }
    }

    
    public void getBody() {
        try{
            PrintCalendar_ cal = (PrintCalendar_) super.clone();
            cal.calendar = (java.util.Calendar) this.calendar.clone();
            cal.calendar.set(cal.calendar.DAY_OF_MONTH, 1);
            int firstDay = cal.calendar.get(cal.calendar.DAY_OF_WEEK);
            int monthTotalDays = this.calendar.getActualMaximum(
                                java.util.Calendar.DAY_OF_MONTH);
            for(int i=1; i<firstDay; i++){
                System.out.print("     ");
            }
           
            for(int i=1; i<=monthTotalDays; i++){
                System.out.printf("%-5d", i);
                if((firstDay+i-1)%7 ==0){
                    System.out.println();
                }
            }
            System.out.println();
        }
        catch(CloneNotSupportedException e){
            System.out.println("Clone not supported.\nPlease try again.");
        }
    }
    
    public void printMonth(){
        System.out.println(months[getMonth()]);
    }
    
    public void printYear(){
        System.out.println(getYear());
    }
    
    public void printDay(){
        System.out.println(days[this.getDay()]);
    }
    
    public void printDate(){
        try{
            System.out.println(days[this.getDay()]+" "+this.getDayOfMonth()+
                    this.getPosition()+" "+ months[this.getMonth()]+" "+
                    this.getYear());
        } 
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private String getPosition()throws Exception{
        int val = this.getValue();
        
        if(val == 0){
            throw new Exception("Invalid place holder.");
        }
        
        String pos ="";
        switch(val){
            case 1:
                pos= "st";
                break;
            case 2:
                pos = "nd";
                break;
            default:
                pos = "th";
                
        }
        return pos;
    }
    
    private int getValue(){
        String pHolder = String.valueOf(this.getDayOfMonth());
        int value =0;
        if(pHolder.length()==1){
            value = Integer.valueOf(pHolder.charAt(0));
        } else if(pHolder.length() ==2){
            value = Integer.valueOf(pHolder.charAt(1));
        }
        return value;
    }
    
    public int getMonth(){
        return this.calendar.get(java.util.Calendar.MONTH);
    }
    
    public int getYear(){
        return this.calendar.get(java.util.Calendar.YEAR);
    }
    
    public int getDay(){
        return this.calendar.get(java.util.Calendar.DAY_OF_WEEK);
    }
    
    public int getDayOfMonth(){
        return this.calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }
    
    @Override 
    public Object clone()throws CloneNotSupportedException {
        PrintCalendar_ cl = (PrintCalendar_)super.clone();
        return cl;
    }
}
