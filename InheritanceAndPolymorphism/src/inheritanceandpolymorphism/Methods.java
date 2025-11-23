/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WIZBRAIN
 */
public class Methods {
    /* 
    //circle();
    //rectangle();
    */
    
    public static void circle(){
        Circle circle =   new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
    }
    
    public static void rectangle(){
        Rectangle rectangle =  new Rectangle(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + 
        rectangle.getPerimeter());   
    }
    
    public static void ArrayList(){
       // ArrayList<SimpleGeometricObjects> ar = new ArrayList<> ();
       Collections c;
        ArrayList<String> arl = new ArrayList<> ();
        print(arl.isEmpty());
        arl.add("Charles");
        print(arl.size());
        arl.add("Tsikpo");
        print(arl.size());
        arl.add("Semenya");
        java.util.Collections.shuffle(arl);
        print(arl.toString());
        print(arl.size());
        print(arl.get(arl.size()-1));
        arl.remove(arl.size()-1);
        print(arl.size());
        arl.indexOf("Charles");
        print(arl.contains("Yasmin"));
        print(arl.isEmpty());
        
        
        
        String[] colors = {"red", "green", "blue"};
        ArrayList<String> colorList = new ArrayList(Arrays.asList(colors));
        String[] colorFromList = new String[colorList.size()];
        colorList.toArray(colorFromList);
        print(colorFromList);
        Collections.shuffle(colorList);
        print(colorList);
        
        Integer[] elements = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(elements));
        print(Collections.min(list));
        print(Collections.max(list));
        print(list);
        Collections.shuffle(list);
        print(list);
    }
    
    public static void distinctNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer. The input ends with 0.");
        int value;
        do{
            value = input.nextInt();
            if(!list.contains(value) && value !=0){
                list.add(value);
            }    
        } while(value !=0);
        
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    public static void MyStack(){
        MyStack stack = new MyStack();
        print(stack.isEmpty());
        stack.push("Charles");
        stack.push("Tsikpo");
        stack.push("Semenya");
        stack.push("Agbenyefia");
        stack.push("Kofi");
        stack.push("Amega");
        print(stack.isEmpty());
        print(stack.peek());
        print(stack.pop());
        print(stack.pop());
        print(stack.getSize());
        print(stack.toString()); 
    }
    
    public static void Triangle(){
        Triangle t = new Triangle(3,4,5,"red",true);
        print(t.toString());
        print(t.getArea());
        print(t.getPerimeter());
    }
    
    
    public static void print(SimpleGeometricObjects str){
        System.out.println(str.toString());
        System.out.println();
    }
    
    public static void print(String str){
        System.out.println(str);
    }
    
    public static void print(Object o){
        System.out.println(o);
    }
    
    public static void print(String[] str){
        for(String d:str){
            System.out.print(d+" ");
        }
        newLine();
    }
    
    public static void newLine(){
        System.out.println();
    }
    
    public static void print(ArrayList<?> list){
        int i=1;
        for(Object e:list){
            System.out.print(e+" ");
            if(i%5==0 && i !=0){
                System.out.println();
            }
            i++;
        }
        newLine();
    }
    
    public static void print(int str){
        System.out.println(str);
    }
    
    public static void print(double str){
        System.out.println(str);
    }
    
    public static void print(boolean str){
        System.out.println(str);
    }
    
    public static void print(Circle str){
        System.out.println(str.toString());
    }
    
    public static void print(Rectangle str){
        System.out.println(str.toString());
    }
    
    public static void TestPersons(){
        PersonTest pt = new PersonTest();
        pt.testDefaultConstructor();
        pt.testParameterizedConstructor();
        pt.testSettersAndGetters();
        pt.testToString();
        
        StudentTest st = new StudentTest();
        st.testDefaultConstructor();
        st.testParameterizedConstructor();
        st.testSettersAndGetters();
        st.testToString();
        
        EmployeeTest empT = new EmployeeTest();
        empT.testDefaultConstructor();
        empT.testParameterizedConstructor();
        empT.testSettersAndGetters();
        empT.testToString();
        
        FacultyTest fT = new FacultyTest();
        fT.testDefaultConstructor();
        fT.testParameterizedConstructor();
        fT.testSettersAndGetters();
        fT.testToString();
        
        StaffTest sT = new StaffTest();
        sT.testDefaultConstructor();
        sT.testParameterizedConstructor();
        sT.testSettersAndGetters();
        sT.testToString();
    }
    
    public static void Account(){
        Account ac = new Account();
        CheckingAccount ca = new CheckingAccount();
        SavingsAccount sa = new SavingsAccount();
        ca.withdraw(10100);
        System.out.println(ca.toString());
        sa.withdraw(1000);
        System.out.println(sa.toString());
        ac.withdraw(1000);
        System.out.println(ac.toString());
    }
    
    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty()|| list.size() ==0){
            return null;
        }else {
            return Collections.max(list);
        }
    }
    
    public static void testMax(){
        ArrayList<Integer> list = new ArrayList();
       System.out.println("Enter List Values");
        do{
            java.util.Scanner input = new java.util.Scanner(System.in);
            list.add(input.nextInt());
        } while(list.get(list.size()-1) !=0);
        
        System.out.println("The maximum value is "+max(list));
        
    }
    
    public static void course(){
        Course course1 = new Course("Mathematics");

        // Add students
        course1.addStudent("Alice");
        course1.addStudent("Bob");
        course1.addStudent("Charlie");

        // Display course info
        System.out.println("Course name: " + course1.getCourseName());
        System.out.println("Students enrolled: " + course1.getstudent());
        System.out.println("Number of students: " + course1.getNumberOfStudents());

        // Check if a student exists
        System.out.println("Is Bob in the course? " + course1.containStudent("Bob"));

        // Remove a student
        course1.removeStudent("Bob");
        System.out.println("After removing Bob: " + course1.getstudent());

        // Add a student using another constructor
        Course course2 = new Course("Physics", "David");
        System.out.println("\nCourse2 name: " + course2.getCourseName());
        System.out.println("Course2 students: " + course2.getstudent());

        // Get student by index
        System.out.println("Student at index 0 in Physics: " + course2.findStudent(0));

        // Drop all students
        course1.dropStudents();
        System.out.println("Students after dropping all from Mathematics: " + course1.getstudent());
    }
    
    public static void displayArrListObjects(){
        Account ac = new Account();
        CheckingAccount ca = new CheckingAccount();
        MyStack myS = new MyStack();
        Circle c = new Circle();
        ArrayList<Object> list = new ArrayList<>();
        list.add(ac);
        list.add(ca);
        list.add(myS);
        list.add(c);
        for(Object e: list){
            System.out.println(e.toString());
        }
    }
    
    public static void Account_(){
        Account_ ac = new Account_("George",1122,1000,1.5);
        ac.deposit(30);
        ac.deposit(40);
        ac.deposit(50);
        ac.withdraw(5);
        ac.withdraw(4);
        ac.withdraw(2);
        ac.printSummary();
    }
    
    
    public static void shuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
    }
    
    public static void addElementsToList(Random r,int min, int max, 
            int numOfElements, ArrayList<Integer> list){
        for (int i=0; i<=numOfElements; i++){
            list.add(r.nextInt(max-min+1)+min);
        }
    }
    
    public static void printMaxRowAndCol(){
        Random input = new Random();
        int[][] arr = new int[5][3];
        fill(arr, input);
        print(arr);
        ArrayList row = maxRow(arr);
        ArrayList column = maxCol(arr);
        System.out.print("The largest row index: ");
        for(Object r: row){
            System.out.print(r+", ");
        }
       System.out.print("\nThe largest column index: ");
       for(Object c: column){
           System.out.print(c+", ");
       }
       System.out.println();
    }
    
    
    public static void fill(int[][] ar, Random input){
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[0].length; j++){
                ar[i][j] = (int) (input.nextInt(2));
            }
        }
    }
    
    public static void fill(ArrayList ar, int num){
        for(int i=0; i<=num; i++){
            ar.add((int)(1+(Math.random()*100)));
        }
    }
    
    public static void print(int[][] ar){
        for(int[] a: ar){
            for(int i=0; i<ar[0].length; i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static ArrayList maxRow(int[][] ar){
        ArrayList<Integer>  indexOfMaxRow= new ArrayList();
        int maxRow=0;
        for(int row=0; row<ar.length; row++){
            int rowTotal =0;
            for(int col=0; col<ar[row].length; col++){
                rowTotal += ar[row][col];
            }
            if(rowTotal >= maxRow){
                maxRow = rowTotal;
            }
        }
        
        for(int row=0; row<ar.length; row++){
            int rowTotal = 0;
            for(int col=0; col<ar[col].length; col++){
                rowTotal += ar[row][col];
            }
            
            if(rowTotal == maxRow){
                indexOfMaxRow.add(row);
            }
        }
        return indexOfMaxRow;
    }
    
    public static ArrayList  maxCol(int[][] ar){
        ArrayList<Integer> indexOfMaxCol = new ArrayList();
        int maxCol =0;
        for(int col=0; col<ar[col].length; col++){
            int colTotal = 0;
            for(int row=0; row<ar.length; row++){
                colTotal += ar[row][col]; 
            }
            
            if(colTotal > maxCol){
                maxCol = colTotal;
            }
            
        }
        
        
        for(int col=0; col<ar[col].length;col++){
            int colTotal =0;
            for(int row=0; row<ar.length; row++){
                colTotal += ar[row][col];
            }
            
            if(colTotal == maxCol){
                indexOfMaxCol.add(col);
            }
        }
        return indexOfMaxCol;
    }
    
    public static void sort(ArrayList<Integer> arL){
        Collections.sort(arL);
        Methods.print(arL);
    }
    
    public static ArrayList<Integer> union(ArrayList<Integer> list1,
            ArrayList<Integer> list2){
        
        list1.addAll(list2);
       
        return list1;
    }
    
    public static void testUnion(){
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list1 = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(2);
        list1.add(5);
        list1.add(7);
        list.add(5);
        list1.add(1);
        list1.add(1);
        list.add(2);
        list1.add(2);
        list1.add(1);
        list1.add(5);
        print("First list is: ");
        print(list);
        print("Second list is: ");
        print(list1);
        print("Union is: ");
        print(union(list,list1));
    }
}
