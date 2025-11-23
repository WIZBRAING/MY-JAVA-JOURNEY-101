/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavafx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author WIZBRAIN
 */
public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;
    private double w=200, h=200;
    
    public ClockPane(){
        this.setCurrentTime();
    }
    
    public ClockPane(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    public void setW(int w){
        this.w = w;
    }
    
    public void setH(double h){
        this.h = h;
    }
    
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    public double getW(){
        return this.w;
    }
    
    public double getH(){
        return this.h;
    }
    
    public void setCurrentTime(){
        Calendar calendar = new GregorianCalendar();
        
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND); 

        
        paintClock();
        
    }
    
    
    protected void paintClock(){

        
        double clockRadius = Math.min(this.w,this.h)*0.8*0.5;
        double centerX = this.w/2;
        double centerY = this.h/2;
        
        Circle clock = new Circle(centerX,centerY,clockRadius);
        clock.setFill(Color.WHITE);
        clock.setStroke(Color.BLACK);
        
        //Write time on clock 
        Text txt12 = new Text(centerX-6,centerY-clockRadius+15,"12");
        Text txt3 = new Text(centerX+clockRadius-12,centerY,"3");
        Text txt6 = new Text(centerX-6,centerY+clockRadius-3,"6");
        Text txt9 = new Text(centerX-clockRadius+3,centerX,"9");
        
        //Draw a second hand 
        double sLength = clockRadius*0.8;
        double secondX = centerX + sLength*Math.sin(this.second*(2*Math.PI/60));
        double secondY = centerY - sLength*Math.cos(this.second*(2*Math.PI/60));      
        Line sLine = new Line(centerX,centerY,secondX,secondY);
        sLine.setStroke(Color.RED);
        
        //Draw a minute hand 
        double mLength = clockRadius *0.65;
        double minuteX = centerX + mLength*Math.sin(this.minute*(2*Math.PI/60));
        double minuteY = centerY - mLength*Math.cos(this.minute*(2*Math.PI/60));
        Line mLine = new Line(centerX,centerY,minuteX,minuteY);
        mLine.setStroke(Color.BLUE);
        mLine.setStrokeWidth(3);
        
        //Draw an hour hand 
        double hLength = clockRadius *0.5;
        double hourX = centerX + hLength*Math.sin((this.hour +this.minute/60)
                        *(2*Math.PI/12));
        double hourY = centerY - hLength*Math.cos((this.hour +this.minute/60)
                        *(2*Math.PI/12));
        Line hLine = new Line(centerX,centerY,hourX,hourY);
        hLine.setStroke(Color.GREEN);
        hLine.setStrokeWidth(5);
        
        this.getChildren().clear();
        this.getChildren().addAll(clock,txt12,txt3,
                txt6,txt9,sLine,mLine,
                hLine);
    }
}
