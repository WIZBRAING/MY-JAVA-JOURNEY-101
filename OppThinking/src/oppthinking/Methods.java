/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author WIZBRAIN
 */
public class Methods {
    
    
    public void StackOfIntegersMethod(){
         Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        course1.addStudent("Anne Kennedy");
        
        course1.dropStudents("Peter Jones");
        
        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
             System.out.print(students[i] + ", ");
        
        
        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
        System.out.println();
    }

    public static boolean isPalindrome(String s){
        System.out.println("CHECKING FOR PALINDROME");
       String s1 = filter(s);
       String s2 = reverseString(s1);
        return s1.equals(s2);
    }
    
    public static String filter(String input){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<input.length();i++){
            if(Character.isLetterOrDigit(input.charAt(i))){
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    
    public static String reverseString(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    
    public static void primeFactors(){
                int x;
        Scanner input = new Scanner(System.in);
        StackOfIntegers st= new StackOfIntegers(); 
        System.out.println("Enter a positive Integer");
        x= input.nextInt();
        
        for (int i=9; i>1; i--){
            
            if (MyInteger.isPrime(i) && x%i ==0)
            {
               st.push(i);
            }
        }
        
        while (st.getSize() >0){
            System.out.println(st.pop());
        }
    }
    
    public static void displayPrimeNumbers(){
        StackOfIntegers st = new StackOfIntegers();
        for (int i=120; i>1;i--){
            if(MyInteger.isPrime(i)){
                st.push(i);
            }
        }
                
        while(st.getSize()-1>=0){
           System.out.println( st.pop()+" ");
        }
    }
    
    public static void account(){
                Account charles = new Account();
        System.out.println("your id is "+charles.getId());
        System.out.println("your balance is "+charles.getBalance());
        System.out.println("your account was created on "+
                charles.getDateCreated());
        charles.deposit(1590);
        System.out.println("your balance is "+charles.getBalance());
        charles.withdraw(500);
        charles.setAnnualInterestRate(12);
        System.out.println("Your monthly interest is "
                +charles.getMonthlyInterest());
        System.out.println(charles.getMonthlyInterestRate());
        System.out.println(charles.getAnnualInterestRate());
    }
    
    public static void atm(){
                ATM atm = new ATM();
    }
    
    public static void course1(){
        Course1 course = new Course1("HTML");
    course.addStudents("Charles");
    course.addStudents("Samuel");
    course.addStudents("Kofi");
    course.addStudents("Mary");
    course.addStudents("Yaw");
    course.addStudents("Mawu");
    
    System.out.println("The total Initial Students are:");
    String[] st=course.getStudents();
    for(String a:st){
        System.out.println(a+" ");  
    }
    
    System.out.println("The reamining students are:");
    course.dropStudent("Kofi");
    st=course.getStudents();
    for(String a:st){
        System.out.println(a+" ");  
    }
    }
    
    public static void tax(){
            // TODO code application logic here  
        // 2009 tax rates and brackets (for example)
        int[][] brackets2009 = {
            {8350, 33950, 82250, 171550, 372950}, // Single
            {16700, 67900, 137050, 20885, 372950}, // Married Joint or Qualifying Widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married Separate
            {11950, 45500, 117450, 190200, 372950} // Head of Household
        };
        
        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // 2001 tax rates and brackets (for example)
        int[][] brackets2001 = {
            {27050, 65550, 136750, 297350}, // Single
            {54100, 131100, 272500, 297350}, // Married Joint or Qualifying Widow(er)
            {27050, 65550, 136750, 148675}, // Married Separate
            {36250, 93650, 169050, 297350}  // Head of Household
        };
        
        double[] rates2001 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Print headers for both years
        System.out.println("2009 Tax Table:");
        printTaxTable(brackets2009, rates2009);
        System.out.println("\n2001 Tax Table:");
        printTaxTable(brackets2001, rates2001);
    }

    // Method to print tax table for a given year
    public static void printTaxTable(int[][] brackets, double[] rates) {
        System.out.printf("%-15s%-20s%-20s%-20s%-20s\n", "Taxable Income", "Single", "Married Joint", "Married Separate", "Head of Household");
        
        // Iterate over taxable income range
        for (double income = 50000; income <= 60000; income += 1000) {
            System.out.printf("%-15.0f", income);
            
            // For each status, compute and print the tax
            for (int status = 0; status < 4; status++) {
                Tax tax = new Tax(status, brackets, rates, income);
                System.out.printf("%-20d", (int)Math.round(tax.getTax()));
            }
            System.out.println();
        }
    }
    
public static void queue(){
        Queue q1 = new Queue(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(15);
        System.out.println("The size of the queue is: "+q1.getSize());
        System.out.println(q1.isEmpty());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.isEmpty());
        System.out.println("The capacity of the queue is: "+ q1.getCapacity());
}

public static void circle2D(){
circle2D c1 = new circle2D(2, 2, 5.5);
        circle2D c2 = new circle2D (4, 5, 10.5);
        circle2D c3 = new circle2D(3, 5, 2.3);
        double pointX=3;
        double pointY=3;
        
        System.out.println("The area of c1 is: "+c1.getArea());
        System.out.println("The perimeter of c1 is: "+c1.getPerimeter());
        
        System.out.println("Does circle c1 contains point(2,2): "
                + ""+c1.contains(pointX,pointY));
        System.out.println("Does circle c1 contains c2: "+c1.contains(c2));
        System.out.println("Does circle c1 contains c3: "+c1.contains(c3));
        System.out.println("Does circle c1 overlaps c2: "+c1.overlaps(c2));
        System.out.println("Does circle c1 overlaps c3: "+c1.overlaps(c3));
}

public static void Triangle2D(){
        MyPoint p1=new MyPoint(0,0);
        MyPoint p2=new MyPoint(10,0);
        MyPoint p3=new MyPoint(5,12);
        Triangle2D t = new Triangle2D(p1,p2,p3);
        Triangle2D t1 = new Triangle2D(new MyPoint(0,0), 
                new MyPoint(3,0), 
                new MyPoint(0,4));
        Triangle2D t2 = new Triangle2D(	new MyPoint(0,0),
                new MyPoint(4,0),new MyPoint (2,3.464));
        
        //getting the area and perimeter of T
        System.out.printf("%s %-2.0f",
                "The area of the triangle is: ",t.getArea());
        System.out.printf("%s %2.2f","\nThe perimeter is: ",
                t.getPerimeter());
        System.out.println();
        
        //getting the area and perimeter of T1
        System.out.printf("%s %2.1f","Area Of T1: ",t1.getArea());
        System.out.println();
        System.out.printf("%s %2.1f", "The Perimeter of T1: ",
                t1.getPerimeter());
        System.out.println();
        
        //getting the area and perimeter of T2
        System.out.printf("%s %2.1f","Area Of T2: ",t2.getArea());
        System.out.println();
        System.out.printf("%s %2.1f", "The Perimeter of T2: ",
                t2.getPerimeter());
        System.out.println();
        
        
        //DECLARING POINTS AND TRIANGLE 
        Triangle2D x= new Triangle2D(new MyPoint(0,0), 
                new MyPoint(6,0),new MyPoint (3,6));
        MyPoint px = new MyPoint(3,2);
        Triangle2D y= new Triangle2D(new MyPoint(0,0), 
                new MyPoint(6,0),new MyPoint(3,6));
        MyPoint py= new MyPoint	(3,0);
        Triangle2D z= new Triangle2D(new MyPoint(0,0),
                new MyPoint(6,0),new MyPoint(3,6));
        MyPoint pz=new MyPoint(0,0);
        Triangle2D z1 = new Triangle2D(new MyPoint(0,0), 
                new MyPoint(6,0), new MyPoint(3,6));
        MyPoint pz1 = new MyPoint(6,6);
        
        //CHECKING IF TRIANGLE CONTAINS A POINT
        System.out.println("Tx contains px: "+x.contains(px));
        System.out.println("Ty contains py: "+y.contains(py));
        System.out.println("Tz contains pz: "+z.contains(pz));
        System.out.println("Tz1 contains pz1: "+z1.contains(pz1));
        
        //DECLARING TRIANGLE 
        Triangle2D a = new Triangle2D(new MyPoint(2,1),
                new MyPoint(4,1), new MyPoint (3,4));
        Triangle2D b = new Triangle2D(new MyPoint(4,1), 
                new MyPoint(7,1), new MyPoint(5,5));
        Triangle2D c = new Triangle2D(new MyPoint(10,10), 
                new MyPoint(12,10),new MyPoint (11,12));
        
        //CHECKING IF THE TRIANGLES OVERLAP WITH TRINAGLE X
        System.out.println();
        System.out.println("Tx contains a: "+x.contains(a));
        System.out.println("Tx contains b: "+x.contains(b));
        System.out.println("Tx contains c: "+x.contains(c));
        System.out.println();
        
        //DECLARING TRIANGLES 
        Triangle2D a1 = new Triangle2D(new MyPoint(2,1), 
                new MyPoint(4,1), new MyPoint(3,4));
        Triangle2D b1 = new Triangle2D( new MyPoint(3,6), 
                 new MyPoint(5,6),  new MyPoint(4,8));
        Triangle2D c1 = new Triangle2D(new MyPoint(3,6), 
                new MyPoint(6,0), new MyPoint(5,5));
        Triangle2D d1 = new Triangle2D(new MyPoint(10,10), 
                new MyPoint(12,10), new MyPoint(11,12));
        
        //CHECKING IF THE TRIANGLES overlaps with TRIANGLE X;
        System.out.println("Tx overlaps a1: "+x.overlaps(a1));
        System.out.println("Tx overlaps b1: "+x.overlaps(b1));
        System.out.println("Tx overlaps c1: "+x.overlaps(c1));
        System.out.println("Tx overlaps d1: "+x.overlaps(d1));
}

public static void Rectangle2D(){
        Rectangle2D r = new Rectangle2D();
        r.setHeight(6);
        r.setWidth(4);
        r.setX(5);
        r.setY(5);
        System.out.println("does r actually contains the\n"
                + "given point "+r.contains(6,5));
        
        //CREATING NEW RECTANGLES AND SETTING IT'S VALUES
        Rectangle2D r1 = new Rectangle2D();
        Rectangle2D r2 = new Rectangle2D();
        r1.setHeight(8);
        r1.setWidth(12);
        r1.setX(10);
        r1.setY(10);
        
        r2.setX(10);
        r2.setY(10);
        r2.setHeight(4);
        r2.setWidth(6);
        System.out.println("Does R1 contains R2: "+r1.contains(r2));
        
        //SETTING VALUES TO CHECK IF RECTANGLE OVERLAPS
        r1.setHeight(6);
        r1.setWidth(8);
        r1.setX(5);
        r1.setY(5);
        
        r2.setX(8);
        r2.setY(5);
        r2.setHeight(4);
        r2.setWidth(6);
        System.out.println("Check if R1 and R2 overlaps: "+r1.overlaps(r2));
        
        //SETTING NEW VALUES TO CHECK FOR OVERLAPPING
        r1.setHeight(4);
        r1.setWidth(4);
        r1.setX(2);
        r1.setY(2);
        
        r2.setX(10);
        r2.setY(10);
        r2.setHeight(4);
        r2.setWidth(4);
        System.out.println("Check if R1 and R2 overlaps: "+r1.overlaps(r2));
}

public static void MyDate(){
        MyDate d = new MyDate();
        MyDate da = new MyDate(34355555133101L);
        System.out.println("Year: "+d.getYear()+ " Month: "+(int)(d.getMonth()+1)+
                " Day: "+d.getDay());
        System.out.println("Year: "+da.getYear()+ " Month: "+
                (int)(d.getMonth()+1)+" Day: "+da.getDay());
        d.setDate(561555550000L);
        System.out.println("Year: "+d.getYear()+ " Month: "+
                (int)(d.getMonth()+1)+ " Day: "+d.getDay()); 
}

public static void BoundingRectangle(){
        double[][] points = new double[5][2];
        Rectangle2D r;
        System.out.println("Enter five points");
        Scanner input = new Scanner(System.in);
        for(int i=0; i<points.length; i++){
            for(int j=0; j<2; j++){
                points[i][j] = input.nextDouble();
            }
        }
        r = BoundingRectangle.getRectangle(points);
        System.out.println("Bounding Rectangle center: ("+r.getX()+","+r.getY()
        +"),\n width: "+r.getWidth()+" and height: "+r.getHeight());
}

public static void revision(){
        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = x.add(y);
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
        System.out.println("z is: "+z);
        String[] str = "charles tsikpo-semenya#Agbenyefia".split("[ #-]");
        for(String a:str){
            
            System.out.print(a.replace(a.charAt(0),
                    Character.toUpperCase(a.charAt(0)))+ " ");
        }
            System.out.println();
            System.out.println("Java is fun".matches("Java.*"));
            System.out.println("Java is fun".matches(".*fun"));
            System.out.println("Java is fun".matches(".*is.*"));
            System.out.println("000-313-23".matches("\\d{3}-\\d{3}-\\d{2}"));
            
            //converting a String to character Array
            char[] chA = "Java".toCharArray();
            char[] dst = "Java 1300".toCharArray();
          "html2435".getChars(4, 8, dst, 5);
          for(char d: dst){
              System.out.print(d +" ");
          }        
}


public static void fiftyDecimalDigits(){
        
        java.math.BigInteger bI = java.math.BigInteger.TEN.pow(49);
        java.math.BigInteger two = new java.math.BigInteger("2");
        java.math.BigInteger three = new java.math.BigInteger("3");

        
        int count =0;
        while(count<10){
            if(bI.mod(two).equals(java.math.BigInteger.ZERO) 
                || bI.mod(three).equals(java.math.BigInteger.ZERO)){
                       System.out.println(bI);
                       count++;
            }
             bI = bI.add(java.math.BigInteger.ONE);
        }

    }

  public  static void squareNumbers(){
        long a = (long) Math.sqrt(Long.MAX_VALUE)+1;
        for (int i=0; i<10; i++){
           BigInteger bI = BigInteger.valueOf(a+i);
           System.out.println(bI.multiply(bI));
        }
    }
  
  
      public static boolean isPrimeBigInt(BigInteger val){
        BigInteger num = BigInteger.valueOf((Long.MAX_VALUE)).add(BigInteger.ONE);
        if(val.compareTo(num)<0) 
            return false;
        if (val.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
            return false;
        BigInteger i = BigInteger.valueOf(3);
        
        for( ; i.multiply(i).compareTo(val)<=0; i = i.add(BigInteger.ONE)){
            if(val.mod(i).equals(BigInteger.ZERO)){
                return false;
            }
        }
        return true;
    }
      
      
    public static void PrintBigIntPrime(){
        BigInteger num = BigInteger.valueOf(Long.MAX_VALUE +1);
        int count =0;
        while(count<5){
            if(isPrimeBigInt(num)){
                System.out.println(num);
                count++;
            }
            num = num.add(BigInteger.ONE);
        }
    }  
    
    
    
    public static boolean isPrime(BigInteger n){
      return  n.isProbablePrime(10);
    }
      
      
    public static boolean isMetersenePrimeBigInt(int n){
        if(!isPrime(BigInteger.valueOf(n))){
            return false;
        }
        
        BigInteger two = BigInteger.valueOf(2);
        BigInteger mp = two.pow(n).subtract(BigInteger.ONE);
        
        
        return isPrime(mp);
    }
    
    public static void printMetersenPrime(){
        for(int p=2; p<=10; p++){
            if(isMetersenePrimeBigInt(p)){
            BigInteger two = BigInteger.valueOf(2);
            System.out.println(two.pow(p).subtract(BigInteger.ONE));
        }           
        }
    }
    
    
    
    
    public static BigInteger getFactorial(int a){
        BigInteger factorial = BigInteger.valueOf(1);
        for(int i=a; i>0; i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    
    public static BigDecimal evalue(int a){
        BigDecimal result = new BigDecimal(0);
        for(int i=1; i<=a; i++){
            result = result.add(BigDecimal.ONE.divide(
            new BigDecimal(getFactorial(i)),25,
                    RoundingMode.HALF_UP));
        }
        
        return result;
    }
    
    public static void printEvalue(int a){
        System.out.println(evalue(a));
    }
    
    
    
    public static boolean isDivisibleBy5And6(BigDecimal value){
        BigDecimal six = BigDecimal.valueOf(6);
        BigDecimal five = BigDecimal.valueOf(5);
        return (value.remainder(six).equals(BigDecimal.ZERO) 
                || value.remainder(five).equals(BigDecimal.ZERO));
    }
    public static void numbersDivisibleByFiveAndSix(){
        BigDecimal value = BigDecimal.valueOf(Long.MAX_VALUE).add(
                BigDecimal.ONE);
        
        int count=0;
        while(count<10){
            if(isDivisibleBy5And6(value)){
                System.out.println(value);
                count ++;
            }
            value = value.add(BigDecimal.ONE);
        }
    }
    
    public static void MyString1(){
        
        MyString1 str = new MyString1("Hello World".toCharArray());
        MyString1 st = new MyString1("Hello World".toCharArray());
        MyString1 s = new MyString1("What are you doing today".toCharArray());
        
        System.out.println(str);
        System.out.println("the length is: "+str.length());
        System.out.println("Character at index 2 is: "+str.charAt(2));
        str = MyString1.valueOf(569873);
        System.out.println("the value of 5 is: " +str);
        System.out.println(st);
        System.out.println("the length is: "+st.length());
        System.out.println("Character at index 2 is: "+st.charAt(2));
        System.out.println(s);
        System.out.println("the length is: "+s.length());
        System.out.println("Character at index 2 is: "+s.charAt(2));
        System.out.println(str.equals(st));
        System.out.println(str.equals(s));
        System.out.println(str.toLowerCase());
        st = MyString1.valueOf(s.subString(5).toString());
        System.out.println(st);  
    }
    
    public static void MyString2(){
        MyString2 str = new MyString2("Hello String");
        System.out.println(str.compare("Hello String"));
        System.out.println(str.compare("ello"));
        System.out.println(str.toUpperCase());
        for(char a: str.toChars()){
            System.out.println(a);
        }
    }
    
    public static void calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Expression");
        String num = input.nextLine();
        num = num.replaceAll("\\s+", "");
        String[] expr = num.split("(?<=[\\+\\*\\-/])|(?=[\\+\\*\\-/])");
        int x = Integer.parseInt(expr[0]);
        int y = Integer.parseInt(expr[2]);
        for(String d: expr){
            System.out.print(d+" ");
        }
        System.out.println();
        double result =0;
        
        switch(expr[1]){
            case "+":
                result = x +y;
                System.out.println(expr[0]+" + "+expr[2]+" = "+result);
                break;
                
            case "-":
                result = x -y;
                System.out.println(expr[0]+" - "+expr[2]+" = "+result);
                break; 
                
            case "*":
                result = x *y;
                System.out.println(expr[0]+" * "+expr[2]+" = "+result);
                break;
                
            case "/":
                if(y>0){
                    result = (double)(x / (y/1.0));
                    System.out.println(expr[0]+" / "+expr[2]+" = "+result);
                } else {
                    System.out.println("Invalid divisor");
                }
                break;
                
            default:
                System.out.println("Invalid expression.\n"
                        + "Do you want to restart?");
                if(input.nextBoolean()){
                    calculator();
                }
                break;
        }  
    }
    
    
    public static String input(){
        System.out.println("ENTER YOUR INPUT");
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    
    
    public static void split(String str, String regex){
        String[] token = str.split("(?="+regex+")|(?<="+regex+")");
        String[] token1 = str.split(regex);
        for(String t:token1){
            System.out.println(t);
        }
        for(String t:token){
            System.out.print(t+" ");
        }
        System.out.println();
    }
    
    
    public static void MyStringBuilder2(){
        MyStringBuilder2 str = new MyStringBuilder2(Methods.input());
        System.out.println(str.toString());
        str.reverse();
        System.out.println(str.toString());
        str.insert(7, str.input());
        System.out.println(str.toString());
        str.reverse();
        str.toUpperCase();
        System.out.println(str.toString());
        System.out.println(str.subString(2));
    }
    
        
}//END OF CLASS
