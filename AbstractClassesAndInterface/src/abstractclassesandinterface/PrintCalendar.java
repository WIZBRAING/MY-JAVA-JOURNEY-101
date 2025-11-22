/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Arrays;
/**
 *
 * @author WIZBRAIN
 */
//Calendar example is found at page 230

public class PrintCalendar {
    private Calendar calendar;
    private String[] months;
    private String[][] daysOfCalendar;
    
    public PrintCalendar(){
        this.calendar = new GregorianCalendar();
        this.daysOfCalendar = new String[5][7];
        this.fill();
        this.months = new String[12];
        fillMonths();
    }
    
    public PrintCalendar(int year, int month){
        this.calendar = new GregorianCalendar(year,month,1);
        this.daysOfCalendar = new String[5][7];
        this.fill();
        this.months = new String[12];
        fillMonths();

    }
    
    public void fillMonths(){
        this.months[0]="January";
        this.months[1] ="February";
        this.months[2] ="March";
        this.months[3] = "April";
        this.months[4] = "May";
        this.months[5] = "June";
        this.months[6] = "July";
        this.months[7] = "August";
        this.months[8] = "September";
        this.months[9] = "October";
        this.months[10] = "November";
        this.months[11] = "December";
    }
    
    public void printCalendar(){
        this.printHead();
        this.printBody();
    }
    
    public void printHead(){
        System.out.println(
                "            "+this.months[calendar.get(
                        this.calendar.MONTH)]+", "+ calendar.get(
                                this.calendar.YEAR) +
                        "\n---------------------------------------");
    }
    
    public void printBody(){
        System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s %-5s\n","Sun",
                "Mon","Tue","Wed","Thu","Fri","Sat");

        //printing days
        printDays();
    }
    
    
    private void printDays(){
        //Getting days to calendar
        this.getDays();
        //gets column length
        int columns = this.daysOfCalendar[0].length;
        //gets row length
        int rows = this.daysOfCalendar.length;
        //prints days in the calendar
        for(int row=0; row<rows; row++ ){
            for(int col=0; col<columns; col++){
                //printing days 
                    System.out.printf("%-5s", this.daysOfCalendar[row][col]);
            }
            System.out.println("\n");
        }

    }
    
    private void getDays(){
        //gets total number of days in a month
        int maxDayInMonth = this.calendar.getActualMaximum(
                              this.calendar.DAY_OF_MONTH);
        
        //creates variable for iteration over days in month
          int i=1; 
          
          //gets first day in the month
            int startDay = getFirstDay();
            
            //creates variable for the week in month
              int startWeek = 0;

              //allocationg days to calendar
        while(i<=maxDayInMonth ){

                this.daysOfCalendar[startWeek][startDay++] = (i)+"";
            if(startDay%7==0 ){
                startWeek++;
                startDay = 0; 
            }
            if(startWeek ==6){
                break;
            }  
            i++;
        }
    }
    
    
    public int getFirstDay(){
        int dayOfWeek = this.calendar.get(this.calendar.DAY_OF_WEEK);
          int dayOfMonth = this.calendar.get(this.calendar.DAY_OF_MONTH);
            int day = dayOfWeek-(dayOfMonth%7)+1;
              int firstDay =  (day>0)? day:(Math.abs(day)+1);
              
              return firstDay;
    }
    
    public void fill(){
        for(String[] a:this.daysOfCalendar){
            Arrays.fill(a, "     ");
        }
    }
   /* @Override
    public String toString(){
        String s= "";
        int columns = this.daysOfCalendar[0].length;
        int rows = this.daysOfCalendar.length;
        for(int col=0; col<columns; col++ ){
            for(int row=0; row<rows; row++){
                s += this.daysOfCalendar[row][col];
            }
            s +="\n";
        }
       return s;
    } */
}
