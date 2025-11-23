/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;
import java.math.BigInteger;
/**
 *
 * @author WIZBRAIN
 */
public class MyInteger {
        private int value;
    
        MyInteger(int value){
            this.value = value;
        }
        
        public int getValue(){
            return this.value;
        }
        
        public boolean isEVen(){
            return isEven(this.value);
        }
        public static boolean isEven(int value){
            boolean isEven = false;
            if(value%2 == 0){
                isEven = true;
            } 
            return isEven;
        }
        
        public static boolean isEVen(MyInteger val){
            int value = val.getValue();
            return isEven(value);
        }
        
        public boolean isOdd(){
            return isOdd(this.value);
        }
        
        public static boolean isOdd(int value){
            boolean isOdd = false;
            if(value % 2 !=0){
                isOdd = true;
            }
            return isOdd;
        }
        
        public static boolean isOdd(MyInteger val){
            int value = val.getValue();
            return isOdd(value);
        }
        
        public boolean isPrime(){
            return isPrime(this.value);
        }
        
        public static boolean isPrime(int value){
            boolean isPrime = true;
            for (int i=2; i<(value);i++){
                if (value % i == 0){
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
        
        public static boolean isPrime(MyInteger val){
            int value = val.getValue();
            return isPrime(value);
        }
        
        public boolean isEqual(int value){
            return (this.value==value)?true:false;
        }
        
        public boolean isEqual(MyInteger val){
            int value = val.getValue();
            return isEqual(value);
        }
        
        public static int parseInt(char[] value){  
            int letter;
            StringBuilder str = new StringBuilder();
            for (int i=0; i<value.length;i++){
                if (Character.isLetter(value[i])){
                    letter = value[i];
                    str.append(letter);
                } else {
                    str.append(value[i]);
                }
                
            }
            int val = Integer.parseInt(str.toString());
            return val;
        }
        
        public static int parseInt(String value){
            int val = Integer.parseInt(value);
            return val;
        }
}
