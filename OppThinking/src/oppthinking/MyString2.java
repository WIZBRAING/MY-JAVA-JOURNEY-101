/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class MyString2 {
    private String str;
    
    public MyString2(String value){
        this.str = new String(value);
    }
    
    public int compare(String value){
        if (value ==null) return Integer.MIN_VALUE;
        return this.str.compareTo(value);
    }
    
    public MyString2 subString(int begin){
        return new MyString2(this.str.substring(begin));
    }
    
    public MyString2 toUpperCase(){
        return new MyString2(this.str.toUpperCase());
    }
    
    
    public char[] toChars(){
        return this.str.toCharArray();
    }
    
    
    public static MyString2 valueOf(boolean b){
          return new MyString2(String.valueOf(b));
    }
    
    @Override
    public String toString(){
        return this.str;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof MyString2){
            return this.str.equals(((MyString2) obj).str);
        }
        return false;
    }
    
}
