/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimeZone;
/**
 *
 * @author WIZBRAIN
 */
public class Time {
    private double hour;
    private double minute;
    private double seconds;
    private double millSeconds;
    
    
    Time (){
        this(System.currentTimeMillis());
        this.millSeconds = System.currentTimeMillis();
    }
    
    Time(long elapseTime){

        this.millSeconds = elapseTime;
        this.seconds = elapseTime/1000;
        this.minute = this.seconds/60;
        this.seconds = this.seconds%60;
        this.hour = this.minute / 60;
        this.minute = this.minute % 60;
    }
    
    public double getHOur(){
        return this.hour;
    }
    
    public double getMinute(){
        return this.minute;
    } 
    
    public double getSeconds(){
        return this.seconds;
    }
    
    public void setTime(long elapseTime){
        this.seconds = elapseTime/60;
        this.minute = this.seconds/60;
        this.seconds = this.seconds%60;
        this.hour = this.minute / 60;
        this.minute = this.minute % 60;
    }
}
