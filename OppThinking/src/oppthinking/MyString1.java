/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class MyString1 {
    private String str;
    
   public MyString1(char[] value){
        this.str = new String(value);
    }
    
    public char charAt(int index){
        return this.str.charAt(index);
    }
    
    public int length(){
        return this.str.length();
    }
    
    public MyString1 subString(int start, int end){
        
        if(end>=str.length()){
            return MyString1.valueOf(-1);
        }
        
        String result = (this.str.substring(start,end));
        return new MyString1(result.toCharArray());
        
    }
    
    
    public MyString1 subString(int start){
        String result = (this.str.substring(start));
        return new MyString1(result.toCharArray());  
    }
    
    
    public MyString1 toLowerCase(){
        return new MyString1 (this.str.toLowerCase().toCharArray());
    }
    
    
    public boolean equals(MyString1 value){
        if(value ==null) return false;
        return this.str.equals(value.str);
    }
    
    
    public static MyString1 valueOf(int i){
        return new MyString1(String.valueOf(i).toCharArray());
    }
    
    public static MyString1 valueOf(String value){
        return new MyString1 (String.valueOf(value).toCharArray());
    }
    
    
    public static MyString1 valueOf(MyString1 value){
        return new MyString1 (value.str.toCharArray());
    }
    
    
    @Override 
    public String toString(){
        return this.str;
    }
}
