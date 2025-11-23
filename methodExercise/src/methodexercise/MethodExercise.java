
package methodexercise;
import java.util.Scanner;
public class MethodExercise {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("ENTER AN INTEGER");
        int number;
        try (Scanner input = new Scanner(System.in)) {
            number = input.nextInt();
        }
                     displayPatterns(number);
                       printFutureInvestmentValue(1000,0.09,2);
                        displayCelFaTable();
                         System.out.println();
                           displayMFTable();
                              testPrime(number);
                               comTable();
                                 printChars('1','z',10);
                                   sumSeries();
                                    piTable();
                                      format(32,5);
                                         sort();
                               

                         

                             
                                
                              
                           
                          

        
       
                           
                           
                           
                           
        
        
    }
    ////////////////////////////////////////////////////////////////////////////
    /////METHOD EXERCISE
                    /* getPentagonalNumbers(number); 
                        getSumOfDigits(number);
                          reverseThis(number);
                             checkIfIsPalindrome(number);
                                displaySortedNumbers(12,10,number);
                                   displayPatterns(number);
                                      printFutureInvestmentValue(10000,0.05,5);


      */
    ////////////////////////////////////////////////////////////////////////////
    
    ////////////////////////////////////////////////////////////////////////////
    //Sorting array using selection sort
    ////////////////////////////////////////////////////////////////////////////
    public static void sort(){
        //creating array
        double[] list = new double[50];
        for (int i=0; i<list.length;i++){
            list[i] = (int)(1+Math.random()*100);
        }
        
        //sorting 
        selectionSort(list,0,list.length);
        
        //displaying result
        for (int i=1;i<=list.length;i++){
            System.out.print(list[i-1]+" ");
            if (i%10==0){
                System.out.println();
            }
        }
    }
     ////////////////////////////////////////////////////////////////////////////
    //selection sort 
    ////////////////////////////////////////////////////////////////////////////
    public static void selectionSort(double[] arr, int low, int high){
        if (low<high){
            int minIndex = low;
            double min = arr[low];
            for (int i=low+1;i<arr.length;i++){
                if(min>arr[i]){
                    minIndex = i;
                    min = arr[i];
                }
            }
            arr[minIndex] = arr[low];
            arr[low] = min;
            
            selectionSort(arr,low+1,high);
        }
    }
        
    ////////////////////////////////////////////////////////////////////////////
    //6.2 (Sum the digits in an integer) 
    ////////////////////////////////////////////////////////////////////////////
    public static void getSumOfDigits(long digit)
    {
        System.out.println("THE SUM OF THE DIGITS IS "+ sumDigits(digit));
    }
    
    public static int sumDigits (long integer)
    {
        int sum =0;
        String l= integer +"";
        for (int i=0; i <=l.length();i++)
        {
            int a = (int)integer %10;
            integer /=10;
            sum += a;
        }


        return sum;
    }
    
    ///////////////////////////////////////////////////////////////////////////
    //6.1 (Math: pentagonal numbers)
    //////////////////////////////////////////////////////////////////////////
    public static void getPentagonalNumbers(int number)
    {
        for (int i=1; i<= number; i++)
        {
           System.out.printf("%-7d", pentagonalNumbers(i));
           
             if (i%10==0)
                 System.out.println();
        }
        
    }
    public static int pentagonalNumbers(int pent)
    {
        return ((pent*((3*pent)-1))/2);

    }
    
    
    /////////////////////////////////////////////////////////////////////////
    ///////////**6.3 (Palindrome integer) 
    ////////////////////////////////////////////////////////////////////////
    public static void reverseThis(int n)
    {
        System.out.println("The reverse of "+n +" is "+reverse(n));
        
    }
    public static void checkIfIsPalindrome(int pal)
    {
        if(isPalindrome(pal))
        {
            System.out.println(pal+" is a Palindrome");
        }
        else
        {
             System.out.println(pal+" is not a Palindrome");
        }
           
    }
    public static int reverse (int number)
    {
        String rev = number +"";
        String revers="";
        int reversed;
        for (int i= rev.length()-1;i>=0;i--)
        {
            revers += rev.charAt(i);
        }
        reversed = Integer.parseInt(revers);
        return reversed;
    }
    
    public static boolean isPalindrome(int number)
    {                  
        return number == reverse(number);
    }
    
    
    
    /////////////////////////////////////////////////////////////////////////
    ///////////*6.5 (Sort three numbers)
    ////////////////////////////////////////////////////////////////////////
    public static void displaySortedNumbers(double a, double b, double c)
    {
        sortNumbers(a,b,c);
    }
    public static void sortNumbers(double num1, double num2,double num3)
    {
        System.out.print("The Numbers are Sorted in Descending order: ");
        if(num1>num2 && num1>num3)
        {
            if(num2 >num3)
            {
                System.out.println(num1+", "+num2 +" and "+ num3);
            }
            else 
            {
                System.out.println(num1+", "+num3 + " and "+ num2);
            }
        }
        else if (num2 >num1 && num2>num3)
        {
            if (num1>num3)
            {
                System.out.println(num2+", "+ num1+" and "+ num3);
            }
            else 
            {
                System.out.println(num2+", "+ num3+" and "+ num1);
            }
        }
        else 
        {
            if (num1>num2)
            {
                System.out.println(num3+", "+ num1+" and "+ num2);
            }
            else 
            {
                System.out.println(num3+", "+num2+ " and "+ num1);
            }
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    ///*6.6 (Display patterns)
    ////////////////////////////////////////////////////////////////////////////
    public static void displayPatterns(int p)
    {
        patterns(p);
    }
    
    public static void patterns(int p)
    {
        
        for (int i=1; i<=p ; i++)
        {
            int k = (p-i)*2;
            
            for (int j=1; j<=k;j++)
            {
                System.out.print(" ");
            }
            for (int l= i; l>0; l--)
            {
                System.out.printf("%2d", l);
            }
            
            System.out.println();
            
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    ///*6.7 (Financial application: compute the future investment value) 
    ////////////////////////////////////////////////////////////////////////////
    public static void printFutureInvestmentValue(double a , double b,double c)
    {
        System.out.printf("The future investment is %5.2f \n",
                futureInvestmentValue(a,b,c));
    }
    public static double futureInvestmentValue(double a, double b, double c)
    {
        return investment(a,(b/12),c);
    }
    
    public static double investment(double amount,double interest,double years)
    {
        return (Math.pow((1+interest), years) * amount);
    }
    
   
    
    ////////////////////////////////////////////////////////////////////////////
    ///*6.7 (Financial application: compute the future investment value) 
    ////////////////////////////////////////////////////////////////////////////
    public static void displayCelFaTable()
    {
                         celFaTitle();
                         celFaBody();

    }
    
    public static void celFaTitle()
    {
          System.out.printf("%-15s %-18s %-9s %-18s %-15s\n",""
             + "Celcius","Fahrenheit","|",""
                   + "Fahrenheit","Celcius");
                         int a=1;
                            while (a<=72)
                            {
                                  System.out.print("_");
                                     a++;
                             }
                            System.out.println();
    }
    
    public static void celFaBody()
    {

        for (int i=40,j=120;i>=31;i--,j-=10)
        {
                          toFahrenheit(i);
                            toCelcius(j);  
        }

    }
    
    public static void toFahrenheit(double celcius)
    {
        System.out.printf("%-16.1f%-19.1f%-10s"
                + "",celcius,celciusToFahrenheit(celcius),"|");

    }
    
    public static void toCelcius(double fahrenheit)
    {
        System.out.printf("%-19.1f%-15.1f\n"
                + "", fahrenheit, fahrenheitToCelcius(fahrenheit));

    }
    
    public static double celciusToFahrenheit(double celcius)
    {
        return (9.0/5)*celcius +32;
    }
    
    public static double fahrenheitToCelcius(double fahrenheit)
    {
        return (5.0/9)*(fahrenheit-32);
    }
   
    
    
    ////////////////////////////////////////////////////////////////////////////
    //6.9 (Conversions between feet and meters)
    ////////////////////////////////////////////////////////////////////////////
    public static void displayMFTable()
    {
        foMeTitle();
        foMeBody();
        
    }

    public static void foMeTitle()
    {
        System.out.printf("%-12s%-14s%-9s%-14s%-12s\n"
                + " ", "Feet", "Meters","|","Meters","Feet");
                    for(int i=1; i<=53;i++){System.out.print("_");}
                     System.out.println();
        
                 
    }
    public static void foMeBody()
    {
        for(int i=1,j=20; i<=10;i++,j+=5 )
        {
        
          footToMeter(i);
          meterToFoot(j);   
        }
            
    }
    public static void footToMeter(double feet )
    {
        System.out.printf("%-12.1f%-14.1f%-9s"
                + "",feet, toMeter(feet),"|");
    }
    public static void meterToFoot(double meters)
    {
        System.out.printf("%-14.1f%-5.1f\n"
                + "",meters,toFoot(meters));
    }
    public static double toMeter(double foot)
    {
        return 0.305*foot;
    }
    
    public static double toFoot(double meter)
    {
        return 3.279*meter;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //6.10 (Use the isPrime Method)
    ////////////////////////////////////////////////////////////////////////////
    public static void testPrime(double n)
    {
        System.out.printf("The number of prime numbers less than %2.0f%2s%2.0f"
                + "",n," is ",(checkPrime(n)-1));
                    System.out.println();
    }
    public static double checkPrime(double pal)
    {
        int pl =0;
        for (int i=1; i<pal;i++)
        {
            if (isPrime(i))
            {
                pl++;
            }
        }
        return pl;
    }
    
    public static boolean isPrime(double pal)
    {
        boolean a=true;
        
        for (int i=2; i<=(pal/2);i++)
        {
            if (pal%i==0)
            {
                a=false;
            }
        }
        
        return a;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //6.11 (Financial application: compute commissions) 
    ////////////////////////////////////////////////////////////////////////////
    public static void comTable()
    {
        comTitle();
        comBody();

    }
    public static void comTitle()
    {
        System.out.printf("%-20s%-15s\n", "Sales Amount","Commission Rate");
        for (int i=1; i<=35;i++)
        {
            System.out.print("_");
            
        }
        System.out.println();
        
    }
    public static void comBody()
    {
        for (int i=10000; i<=100000; i+=5000)
        {
            com(i);
        }
        
    }
    public static void com(double com)
    {
        if (com <0.01)
        {
            System.out.println("invalid input");
            MethodExercise.com(com);
        }
        else 
        {
               if (com>=0.01 && com < 5000)
               {
                   System.out.printf("%-21.2f%-15.2f\n"
                           + "",com , com*8/100);
                   }
                    else if (com <= 10000)
               {
                   System.out.printf("%-21.2f%-15.2f\n"
                           + "",com , com * 10/100);
               }
                       else 
               {
                   System.out.printf("%-21.2f%-15.2f\n"
                           + "",com , com*12/100);  
               }
        
         }

        

    }
  
    
    ////////////////////////////////////////////////////////////////////////////
    //6.12 (Display characters)
    ////////////////////////////////////////////////////////////////////////////
    public static void printChars (char n, char m, int num)
    {
        chars(n,m,num);
    }
    
    public static void chars ( char n, char m, int num)
    {
        int a = n+1;
        int count =1;
        for (int i=a; i<m; i++)
        {
            System.out.print(getChars((char)i));
            System.out.print(" ");
            if (count % num ==0)
            {
                System.out.println();
            }
            count ++;
        }
        System.out.println("\n");
    }
    
    public static char getChars (char a)
    {
        return a;
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //*6.13 (Sum series)
    ////////////////////////////////////////////////////////////////////////////
    public static void sumSeries()
    {
        titleOfSeries();
        bodyOfSeries();
        
    }
    public static void titleOfSeries()
    {
        System.out.printf("%-10s%-10s\n", "i","m(i)");
         for (int i=1; i<=17;i++){System.out.print("_");}
          System.out.println();
         
    }
    public static void bodyOfSeries()
    {
        for (int i=1; i<=20;i++)
        {
           System.out.printf("%-10d%-10.4f\n", i, sumOfSeries(i));
        }
    }
    public static double sumOfSeries(double num)
    {
        double sum=0;
        for (int i=1; i<=num; i++)
        {
            sum+=series(i);
        }
        return sum;
    }
    public static double series(double num)
    {
        return num/(num+1);
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //*6.14 (Estimate p) p
    //////////////////////////////////////////////////////////////////////////// 
    public static void piTable()
    {
        piTitle();
        piBody();
    }
    public static void piTitle()
    {
        System.out.printf("%-24s%-15s\n", "i","m(i)");
        for (int i=1;i<=30;i++)
        {
            System.out.print("_");
        }
        System.out.println();
    }
    public static void piBody()
    {
        for (int i=1; i<=901;i+=100)
        {
            System.out.printf("%-15d%15.4f\n",i,getPI(i));
        }
    }
    public static double getPI(double value)
    {
        double sum =0;
        for (int i=1;i<=value;i+=100)
        {
            sum+= (Math.pow((-1),(i+1))/(2*i-1));
        }
        return 4*(1-sum);
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //6.37 (Format an integer)
    ////////////////////////////////////////////////////////////////////////////
    public static String format(int number, int width)
    {
        System.out.println(formt(number,width));
        return formt(number,width);
         
    }
    
    
    public static String formt(int l, int w)
    {
        String len = l+"";
        if (w>len.length())
        {
            String count="";
            for (int i=1;i<=w-len.length();i++)
            {
                count +="0";
            }
            return count +len;
        }
        return len;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
