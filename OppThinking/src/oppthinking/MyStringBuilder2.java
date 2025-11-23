/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

import java.util.Scanner;

/**
 *
 * @author WIZBRAIN
 */
public class MyStringBuilder2 {
    private StringBuilder str;
    
    MyStringBuilder2(){
        this.str = new StringBuilder();
    }
    
    MyStringBuilder2(char[] characters){
        this.str = new StringBuilder(new String(characters));
    }
    
    MyStringBuilder2(String value){
        this.str = new StringBuilder(value);
    }
    
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        this.str.insert(offset, s.toString());
        return this;
    }
    
    public MyStringBuilder2 reverse(){
        this.str.reverse();
        return this;
    }
    
    public MyStringBuilder2 subString(int begin){
        String sub = this.str.substring(begin);
        return new MyStringBuilder2(sub);
    }
    
    public MyStringBuilder2 toUpperCase(){
        String upper = this.str.toString().toUpperCase();
        this.str.setLength(0);
        this.str.append(upper);
        return this;      
    }
    
    public MyStringBuilder2 input(){
        System.out.println("ENTER YOUR INPUT");
        Scanner input = new Scanner(System.in);
        return new MyStringBuilder2 (input.nextLine());
    }
    
    public static String inputString(){
        System.out.println("ENTER YOUR INPUT");
        Scanner input = new Scanner(System.in);
        return (input.nextLine());
    }
    
    @Override 
    public String toString(){
       return this.str.toString();
    }
    
}
