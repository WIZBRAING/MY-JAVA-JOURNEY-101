/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author WIZBRAIN
 */
public class Methods {
    
    public static void print(boolean value){
        System.out.print(value);
    }
    
    public static void print(int value){
        System.out.print(value);
    }
    
    public static void print(double value){
        System.out.print(value);
    }
    
    public static void print(String value){
        System.out.print(value);
    }
    
    public static void newLine(){
        System.out.println();
    }
    
    public static int quotient(int a, int b)throws ArithmeticException{
       
        if(b == 0){
            throw new ArithmeticException("Divisor cannot be zero.");
        } 
        return a/b;
    }
    
    
    
    public static int input(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueInput = true;
        int value =0;
        do{
            try{
                System.out.println("Enter two integers");
                value = input.nextInt();
                continueInput = false;
            }
            catch(InputMismatchException ex){
                System.out.println("Try again. ( incorrect input"+"Integer is"
                        + "required.)");
                input.nextLine();
            }
            
        } while(continueInput);
        return value;
    }
    
    
    
    
    public static void trial(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueInput = true;
        int a=0,b=0;
        do{
            try{
                System.out.println("Enter two integers");
                     a = input.nextInt();
                         b = input.nextInt();
                
                System.out.println("You have entered: "+a+" and "+b);
                    continueInput = false;
            }
            catch(InputMismatchException ex){
                System.out.println("Try again.(Incorrect input:"
                        + ""+"Integer is required.)");
                                input.nextLine();
            }  
        } while(continueInput);
        
        //
        try{
            System.out.println(a+" / "+b+" is "+quotient(a,b));
        } 
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("System execution continues....\n");
    }
    
    
    
    public static void zeroDivision(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter two integers");
        int a = input.nextInt();
        int b = input.nextInt();
        if(b != 0){
            System.out.println("a/b = "+a/b);
        } else {
            System.out.println("You cannot divide by zero");
        }
    }
    
    
    
    public static int input_(){
        int num =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Number");
        num = input.nextInt();
        return num;
    }
    
    public static void printInput(){
        try{
           System.out.println("You've Entered: "+input_());  
        } catch(InputMismatchException ex){
            
        }
    }
    
    public static double divide(int a, int b)throws ArithmeticException, IllegalArgumentException{
        if(b==0){
            throw new ArithmeticException("You Cannot Divide By: ");
        }
        return a/(b/1.0);
    }
    
    public static void printDivision(){
        int a=0;
        int b=0;
        DecimalFormat df = new DecimalFormat("#.00");
        try{
            a = input_();
            b = input_();
            System.out.println(a+" divided by "+b+" is: "
                    +df.format(divide(a,b)));
            
        } catch(ArithmeticException ex){
            
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            
        } catch(InputMismatchException ex){
            
            System.out.println("Invalid input.\nPlease input integer value");
        }
    }
    
    public static void stackElement(){
        try{
            System.out.println(sum(new int[]{3,5,6,8,9,2,4}));
        } 
        catch(Exception ex){
            ex.printStackTrace();
              System.out.println(ex.getMessage());
                System.out.println(ex.toString()+"\n");
            
            System.out.println("Trace Info from getStackTrace");
              StackTraceElement[] elements = ex.getStackTrace();
                for(int i=0; i<elements.length; i++){
                    System.out.println("Method: "+elements[i].getMethodName());
                    System.out.println("Class "+elements[i].getClassName());
                    System.out.println("Line Number "+elements[i].getLineNumber()
                            +"\n");
                }
        }
    }
    
    private static int sum(int[] list){
        int result=0;
        for (int i=0; i<=list.length; i++){
            result += list[i];
        }
        return result;
    }
    
    public static void CircleWithException(){
        
        try{
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);  
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("The number of Objects created: "+
                CircleWithException.getNumberOfObjects());
    }
    
    public static void tryingFinally(){
               try{
            int a = Methods.input_();
            int b = Methods.quotient(a, 4);
            int c = Methods.input_();
        } 
        catch(InputMismatchException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Finally Statement");
        }
        System.out.println("Statement after Finally");
    }
    
    public static boolean isNumeric(String token){
                int len = token.length();
         return token.matches("\\d{"+len+"}");
    }
    
        public static void tryChainedException(){
                try{
            method1();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void method1() throws Exception {
        try{
            method2();
        }
        catch(Exception ex){
           throw new Exception("New info from method1",ex);
        }
    }
    
    public static void method2() throws Exception {
        try{
            method3();
        }
        catch(Exception ex){
           throw new Exception("New info from method2",ex);
        }
    }
  
    public static void method3() throws Exception {
        throw new Exception("New info from method3");
    }

    
    public static void printingToFile(){
                java.io.File file = new java.io.File("files/example.txt");
        if(file.exists()){
            System.exit(0);
        } else {
        try(
                java.io.PrintWriter printToFile = new java.io.PrintWriter(file);
                ){
            System.out.println(file.getAbsolutePath());
            printToFile.println("Hello File.");
            printToFile.println("-------------");
            printToFile.println("This is my first file creating practice.");
            printToFile.println("I hope it is nice and works perfectly.");
            printToFile.close();
            
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } //end of try
        }//end of if
    }
    
public static File writeFile(){
        java.io.File scores = new java.io.File("scores.txt");
        if(scores.exists()){
            System.exit(0);
        }
                    
        try( 
            java.io.PrintWriter pw = new java.io.PrintWriter(scores);    
            ){
            
            pw.print("John T Smith ");
            pw.println(90);
            pw.print("Eric K Jones ");
            pw.println(85);
            pw.close();
            
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return scores;
    }
    
    public static File creatingMyFile(String text){
            File myFile = new File(text);
        try{
            if(myFile.createNewFile()){
                          Methods.print("File created: "+myFile.exists());
                          Methods.newLine();
                          Methods.print(myFile.getAbsolutePath());
                          Methods.newLine();
                          Methods.print(myFile.getPath());
                          Methods.newLine();
                          Methods.print("the file was last modified on: "+myFile.lastModified());
                          Methods.newLine();
                          Methods.print(myFile.isHidden());
                          Methods.newLine();
            } else {
                          Methods.print("File already exists");
                          Methods.newLine();
            }
        }
        catch(IOException ex){
                      Methods.print(ex.getMessage());
        }
        return myFile;
    }
    
    public static void creatingFile(){

        try{
                 java.io.File myFile = new java.io.File("files/example.pdf");
                 if(myFile.createNewFile()){
                  Methods.print("Does file exists: "+myFile.exists());
                  Methods.newLine();
                  Methods.print("the lenght is "+myFile.length());
                  Methods.newLine();
                  Methods.print("File can be read: "+myFile.canRead());
                  Methods.newLine();
                  Methods.print("File can be written: "+myFile.canWrite());
                  Methods.newLine();
                  Methods.print("File is hidden: "+myFile.isHidden());
                  Methods.newLine();
                  Methods.print("Is a file: "+myFile.isFile());
                  Methods.newLine();
                  Methods.print("Path is absolute: "+myFile.isAbsolute());
                  Methods.newLine();
                  Methods.print("Path is directory: "+myFile.isDirectory());
                  Methods.newLine();
                  Methods.print("the absolute Path is: "+myFile.getAbsolutePath());
                  Methods.newLine();
                  Methods.print("the canonical Path is: "+myFile.getCanonicalPath());
                  Methods.newLine();
                  Methods.print("the Path is: "+myFile.getPath());
                  Methods.newLine();
                  Methods.print("the file name is : "+myFile.getName());
                  Methods.newLine();
                  Methods.print("the file is deleted: "+myFile.delete());
                  Methods.newLine();
                  Methods.print("the file was last modified on: "+myFile.lastModified());
                  Methods.newLine();
                  Methods.print("file is create: "+myFile.mkdir());
                  Methods.newLine();
                 } else {
                     Methods.print("File already exists.");
                     Methods.print("the absolute Path is: "+myFile.getAbsolutePath());
                 }

        }
        catch(IOException ex){
            Methods.print(ex.getMessage());
        }
        Methods.newLine();
    }
    
    public static void transferFile(){
         java.io.File file = new java.io.File("scores.txt");
        try(
                java.util.Scanner read = new java.util.Scanner(file);
                java.io.PrintWriter write = new java.io.PrintWriter("temp.txt");
                ){
            while(read.hasNext()){
                String text = read.nextLine();
                write.println(text);
            }
            read.close();
            write.close();
        }
        catch(java.io.FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    
    public static void lineSeparator(){
        String lineSep = System.getProperty("line.separator");
        Methods.print(lineSep);
    }
    
    
    public static void test(){
        java.io.File f = new java.io.File("me.txt");
        java.io.File f1 = new java.io.File("hmm.txt");
        MyFile file = new MyFile("us.txt");
        MyFile file1 = new MyFile("example.txt");

        file.writeToFile("this is us.txt");
        file1.writeToFile("this is example.txt");

 
        file.renameFile(f);
        MyFile.listOfFiles();
        file.readFromFile();
        file1.readFromFile();
        f.renameTo(f1);
        System.out.println(f.getName());
    }
    
    
    public static boolean isAlpha(String arg){
        String token = Arrays.toString(arg.trim().split(""));
        char[] chArray = token.toCharArray();
        for(char d: chArray){
            if(!Character.isAlphabetic(d)){
                return false;
            }
        }
        return true;
    }
    
    
    public static void readFrom(File file){
        try(
              java.util.Scanner read = new java.util.Scanner(file);  
                ){
            while(read.hasNext()){
                String text = read.nextLine();
                System.out.println(text);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    public static void writeTo(File file, String text){
        try(
               java.io.PrintWriter printTo = new java.io.PrintWriter(file);
                ){
            printTo.println(text);
        }
        catch(java.io.FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    public static void appendTo(File file, String text){
        try(
                java.io.PrintWriter printTo = new java.io.PrintWriter(file);
                ){
            printTo.append(text);
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }    
    
    
    public static void replaceFile(File replacement, File original)throws IOException{
        StringBuilder str = fileToStringBuilder(original);
        String strr = "charles how are you doing this evening";
        try(
                Scanner read = new Scanner(replacement)){
            
            while (read.hasNext()){
                str.toString().replaceAll("chalres","kofi"); 
            }
            System.out.println(str);
        } catch(IOException ex){
            throw ex;
        }
    }
    
    public static StringBuilder  fileToStringBuilder(File file){
            StringBuilder builder = new StringBuilder();
        try{
            java.util.Scanner read = new java.util.Scanner(file);
            while (read.hasNext()){
                builder.append(read.next()+" ");
            }
            System.out.println(" Successfully printed to string builder");
        } catch(FileNotFoundException ex){
            System.out.println("File not found\n");
            ex.printStackTrace();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        return builder;
    }
    
    
    
    public static void crawl(String url){
        ArrayList<String> pending = new ArrayList<>();
        ArrayList<String> traversed = new ArrayList<>();
        pending.add(url);
        
        while(!pending.isEmpty() && traversed.size()<100 ){
            String cUrl = pending.remove(0);
            if(!traversed.contains(cUrl)){
                traversed.add(cUrl);
                System.out.println("crawl "+cUrl);
            }
            
            for(String s: getSubUrl(url)){
                if(!traversed.contains(s)){
                    pending.add(s);
                }
            }
            
        } //END OF WHILE
    }//END OF CRAWL
    
    public static ArrayList<String> getSubUrl(String url){
        ArrayList<String> subUrls = new ArrayList<>();
        
        try{
            java.net.URL cUrl = new java.net.URL(url);
            java.util.Scanner read = new Scanner (cUrl.openStream());
            int cIndex =0;
            while(read.hasNext()){
                String line = read.nextLine();
                cIndex = line.indexOf("http:",cIndex);
                
                while(cIndex>0){
                    int eIndex = line.indexOf("\"",cIndex);
                    if(eIndex > 0){
                        subUrls.add(line.substring(cIndex,eIndex));
                        cIndex = line.indexOf("http:",eIndex);
                    } else {
                        cIndex = -1;
                    }
                }
            }
            read.close();
        }
        catch(MalformedURLException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
          return subUrls;  
    }//END OF GET SUB URL
    
    
    public static void removeText(){

        Exercises ex = new Exercises();
        
        try { 
            File file = new File("files/removeText.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.println("removes the string John from the specified file. "
                    + "Your program should get the \n" +
                         "arguments from the command line.");
            writer.close();
            Scanner reader = new Scanner(file);
             while(reader.hasNext()){
                 System.out.println(reader.nextLine());
             }
             reader.close();

             System.out.print("\nEnter the text you want to remove: ");
             String input = new Scanner(System.in).next();
             ex.removeText(input, file);
             Scanner read = new Scanner(file);
             while(read.hasNext()){
                 System.out.println(read.nextLine());
             }
             reader.close();
 
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
    }
    
    public static void formatCode(){
        Exercises ex = new Exercises();
        
        try{
             File file = new File("files/formatText.txt");
             Scanner reader = new Scanner(file);
                
             while(reader.hasNext()){
                 String line = reader.nextLine();
                 System.out.println(line);
             }
             reader.close();
            ex.reFormatCode(file);
            Scanner read = new Scanner(file);
            while (read.hasNext()){
                String line = read.nextLine();
                System.out.println(line);
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void count_L_W_C(){
        Exercises ex = new Exercises();
        File file = new File("files/removeText.txt");
        ex.count_L_W_C(file);
    }
    
    
    //Programming Exercise 7.35////////////////////////////////////////////
    /////////////////////////////////////////////////////////// 
    
    public void hangman(){
        Scanner input = new Scanner(System.in);
        String word = guessWord();
        char[] letter = word.toCharArray();
        int countErrors =0;
        StringBuilder match = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            match.append("*");
        }
        
        
        for(int i=0; i<word.length(); i++){
            System.out.print("Enter a letter in word "+ match+" > ");
            boolean guessedRight =false;
            String letterRead = input.next();
            
            for(int j=0; j<word.length(); j++){
                if(letterRead.charAt(0)==letter[j] && 
                        match.charAt(j)=='*'){
                  
                    match.setCharAt(j, letterRead.charAt(0));
                    guessedRight =true;
                    
                } else if(letterRead.charAt(0)==letter[j] && 
                        match.charAt(j)!='*'){
                    
                    System.out.print(letterRead.charAt(0)+
                            " is already in the word\n");
                } else if(letterRead.charAt(0)==letter[j]){

                }
            }
            
            if(!guessedRight){
                     System.out.print(letterRead.charAt(0)+
                             " is not in the word\n");
                countErrors++;
            }
            
            if(word.equals(match.toString())){
                System.out.println("You got it correct.");
                break;
            }
        }
         
        System.out.println("The word is "+word+". You missed "+countErrors+""
                + " time(s)\nDo you want to try again. Yes or No : ");
        if(input.next().toLowerCase().equals("yes")){
            System.out.println();
            hangman();
        }
        
    }


    public String guessWord(){
            String[] words = {
            "apple", "banana", "cherry", "date", "elderberry", "fig", "grape",
            "honeydew", "kiwi", "lemon","mango","nectarine","orange", "papaya",
            "quince", "raspberry","strawberry", "tangerine", "ugli", "vanilla",
            "watermelon", "xigua", "yam", "zucchini", "apricot", "blueberry",
            "coconut", "dragonfruit", "eggplant", "feijoa","guava", "hazelnut", 
            "iceberg", "jackfruit", "kumquat", "lime", "mulberry", "nutmeg", 
            "olive", "peach","pear", "pineapple", "plum","pomegranate","radish",
            "spinach", "tomato","turnip", "walnut","acorn","broccoli","cabbage",
            "carrot","cauliflower","celery","chili","corn","cucumber","garlic",
            "ginger","kale", "lettuce", "mushroom", "okra", "onion", "parsley", 
            "pea", "pepper", "potato","pumpkin","shallot","squash","sweetcorn", 
            "sweetpotato","thyme","zest","basil","bayleaf","chive","cilantro",
            "dill","fennel","lemongrass","marjoram","mint","oregano","rosemary",
            "sage", "saffron", "tarragon","vanilla","wasabi", "yarrow", "zatar",
            "almond", "cashew", "pecan", "pistachio", "macadamia", "chestnut" };
               
            return words[(int)(0+Math.random()*100)];
    }
    
} //END OF CLASS
