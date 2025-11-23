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
public class MyStringBuilder {
    private StringBuilder str;
    
    MyStringBuilder(String string){
        this.str = new StringBuilder(string);
    }
    
    MyStringBuilder(MyStringBuilder string){
        this.str = new StringBuilder(string.toString());
    }
    
    public MyStringBuilder append(MyStringBuilder s){
        this.str.append(s.toString());
        return this;
    }
    
    public MyStringBuilder append(int i){
        this.str.append(i);
        return this;
    }
    
    public int length(){
       return this.str.length();
    }
    
    public char charAt(int i){
        return this.str.charAt(i);
    }
    
    public MyStringBuilder toLowerCase(){
        String lowercase = this.str.toString().toLowerCase();
        this.str.setLength(0);
        this.str.append(lowercase);
        return this;
    }
    
    public MyStringBuilder subString(int begin, int end){
        return new MyStringBuilder( this.str.substring(begin, end));
    }
    
    public String toString(){
        return this.str.toString();
    }

    public MyStringBuilder delete(int begin, int end){
        this.str.delete(begin, end);
        return this;
    }
    public MyStringBuilder input(){
        System.out.println("ENTER YOUR INPUT");
        Scanner input = new Scanner(System.in);
        return new MyStringBuilder (input.nextLine());
    }
}
