/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.Scanner;
/**
 *
 * @author WIZBRAIN
 */
public class Tv {
    private boolean power;
    private boolean mute;
    private int volume;
    private int channel;
    
    
    Tv(){
        this.power = false;
        this.mute = false;
        this.volume = 50;
        this.channel = 1;
    }
    
    Tv(boolean power, int volume, int channel){
        if (!(power)) {
            System.out.println("Cannot set volume or channel while power is of");
        } else if (volume < 0 || volume > 100) {
            System.out.println("Volume out of range. Volume range = 0 to 100 ");
        } else if (channel < 0 || channel > 200) {
            System.out.println("Channel out of range. Channel range = 0 to 200");
        } else {
            this.power = power;
            this.volume = volume;
            this.channel = channel;
            this.mute = false;
        }
    }
    
    public boolean isPowerOn(){
        return this.power;
    }
    
    public void turnOn(){
        if(this.power){
            System.out.println("Tv is alread on. No need to turn on again.");
        } else {
            this.power = true;
              System.out.println("Tv power is turned On");
        }
        
    }
    
    public void turnOff(){
        if (!this.mute){
            System.out.println("Tv is alread off. No need to turn it off again");
        } else {
              this.power = false;
               System.out.println("Tv is turned Off");

        }
    }
    
    public boolean isMute(){
        return this.mute;
    }
    
    public void unmute(){
        if(this.mute){
            this.mute = false; 
            System.out.println("The Tv is unmuted successfuly.");
        } else {
           System.out.println("The Tv is alread on unmute.");
        }
        
    }
    
    public void mute(){
        if (this.mute){
            System.out.println("The Tv is already on mute.");
        } else {
            this.mute = true;
            System.out.println("The Tv is muted successfully.");
        }

    }
    
    
    
    public int getVolume(){
        if(this.mute){
            System.out.println("Tv is on mute cannot get volume");
             return -1;
        } 
            return this.volume;     
    }
    
    public void setVolume(int volume){
        if(volume>0 && volume<=100){
                    this.volume = volume;
        System.out.println("volume successfully set to: "+this.volume);
        }

    }
    
    public void volumeUp(){
        if(this.volume ==100){
            System.out.println("Tv volume is: "+this.volume+". Cannot increase further.");
        } else {
                    this.volume++;
                 System.out.println("Volume increased to: "+this.volume);
        }
    }
    
    public void volumeDown(){
        if(this.volume == 0){
            System.out.println("Tv volume is: "+this.volume+". Cannot decrease further.");
        } else {
                   this.volume--;
               System.out.println("Volume decreased to: "+this.volume);
        }
    }
    
    public int getChannel(){
        return this.channel;
    }
    
    public void setChannel(int channel){
        if(this.channel>=1 && this.channel<=200){
           this.channel = channel;
            System.out.println("Channel set to: "+this.channel);
        } else {
            System.out.println("Channel out of range. Channel should be between 0 and 201");
        }

    }
    
    public void nextChannel(){
        if (!(this.channel == 200)){
                    this.channel++;
             System.out.println("Channel moved to next: "+this.channel);
        } else {
            this.channel = 0;
        }
    }
    
    public void priviousChannel(){
        if(this.channel>=1){
            this.channel--;
        System.out.println("Channel moved to privious: "+this.channel);
        } else {
            this.channel = 200;
        }
    }
    
    
}//end of class
