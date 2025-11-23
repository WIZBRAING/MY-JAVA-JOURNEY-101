/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author WIZBRAIN
 */
public class Stopwatch {
    private double startTime;
    private boolean working;
    private double endTime;
    
    Stopwatch(){
        this.startTime  = System.currentTimeMillis();
        this.working = true;
    }
    
    public void start(){
        this.startTime = System.currentTimeMillis();
        this.working = true;
    }
    
    public void stop(){
        this.endTime = System.currentTimeMillis();
        this.working =false ;
    }
    
    
    public double getStartTime(){
        if(this.working){
            return this.startTime;
        } else {
            System.out.println("Start Timer to get Start time");
        }
        return -1;
    }
    
    public double getEndTime(){
        if (!this.working){
            return this.endTime;
        } 
        
        stop();
        return this.endTime;
        
    }
    
    public double getElapseTime(){
        if(!this.working){
             return (this.getEndTime()-this.getStartTime());
        } else {
            System.out.println("Stop timer to get elapse time");
        }
        return -1;   
    }
    
    
    
}
