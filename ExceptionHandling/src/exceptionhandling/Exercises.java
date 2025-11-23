/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.io.IOException;
import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Collection;
import java.util.Collections;

import java.net.URL;
import java.net.MalformedURLException;
import java.text.DecimalFormat;

import java.util.Random;
import java.util.Arrays;
import java.io.BufferedReader;

/**
 *
 * @author WIZBRAIN
 */
//Work on Exercise 12.12
//Dont forget to do  Exercise 12.31 and 12.32;
public class Exercises {
    
    Exercises(){
        
    }
    //EXERCISE 12.31////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void crawler_(){
        ArrayList<String> pending = new ArrayList<>();
        ArrayList<String> traversed = new ArrayList<>();
        String cUrl = "http://cs.armstrong.edu/liang";
        
        try{
            URL url = new URL(cUrl);
            
            pending.add(cUrl);

        }
        catch(MalformedURLException e){
            System.out.println("Bad url "+ e.getMessage());
        }
        
    }
    
    private void getWord(){
        
    }
    //EXERCISE 12.31////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    
    
    //EXERCISE 12.30////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void occurenceOfEachLetters(){
        String fileName = getFileName();
        printOccurence(fileName,'A');
    }
    
    
    
    private void printOccurence(String path, char value){
        
        if(Character.toLowerCase(value) != 'a'){
            System.out.println("Invalid letter in \"occurenceOfEachLetters()"
                    + "\"\nPlease try again.");
            return;
        }
        
        char low = Character.toLowerCase(value);
        char upp = Character.toUpperCase(value);
        int[] lowerC = getOccurenceOfLetter(path,low);
        int[] upperC = getOccurenceOfLetter(path,upp);
        
        
        for(int i=0; i<lowerC.length ; i++){
            if(lowerC[i] !=0){
                char c =  (char)('a'+i);
                System.out.println("Number of "+c+"'s: "+lowerC[i]);
            } 
            if(upperC[i] !=0){
                char c =  (char)('A'+i);
                System.out.println("Number of "+c+"'s: "+upperC[i]);
            }
        }
    }
    
    
    
    private int[] getOccurenceOfLetter(String path,char value){
        String fileName = path;
        int[] letters = new int[26];
        
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fr);
            int ch=0;
            while( (ch = reader.read()) != -1){
                char c = (char)ch;
                if(Character.isLowerCase(c) &&
                         Character.isLowerCase(value)){
                    
                    if(!(c-value <0))
                    letters[c-value]++;
                    
                } else if(Character.isUpperCase(c) && 
                        Character.isUpperCase(value)){
                    if(!(c-value <0))
                    letters[c-value]++;
                }
            }  
            fr.close();
            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: "+fileName);
        }
        catch(IOException e){
            System.out.println("Error occured : "+e.getMessage());
        }
        return letters;
    }
    
    
    
    private String getFileName(){
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String path = input.next();
        return path;
    }
    //EXERCISE 12.29////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void renameFiles_(){
        String dirName = "files/Directories/Rename";
        File dir = new File(dirName);
        String[] files = dir.list();
        
        if(files == null){
            System.out.println("No file exists uder directory "+dirName);
            return;
        }
        
        for(String f: files){
            char[] token = f.toCharArray();
             int index = f.indexOf("_");
              if(index > 0){
                  for(int i=token.length-1; i>index; i--){
                      if(Character.isDigit(token[i])){
                          if(!Character.isDigit(token[i-1])){
                              File file = new File(dirName,f);
                              StringBuilder fName = new StringBuilder(f);
                              fName.insert(index+1, "0");
                              if(file.renameTo(new File(dirName,
                                      fName.toString()))){
                                  System.out.println("Rename successful: " + f + 
                                         " → " + fName);
                                  break;
                              } else {
                                  System.out.println("Rename failed: " + f);
                                  break;
                              }
                          } else {
                              System.out.println("Number is two digits: "+f);
                              break;
                          }
                      }
                  }
              } else {
                  System.out.println("Character \"_\" not found in file Name"
                          + ": "+f);
              }
        }
    }
    //EXERCISE 12.28////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void renameFiles(){
        String dirName = "files/Directories/Rename";
         File dir = new File(dirName);
          String[] files = dir.list();
           
          if(files == null){
              System.out.println("No files exiss");
              return ;
          }
           
             for(String f:files){
                 char[] token = f.toCharArray();
                 for(int i=0; i<token.length; i++){
                     if(Character.isDigit(token[i])){
                         if(!Character.isDigit(token[i+1])){
                             String pName = dirName+"/"+f;
                             File file = new File(pName);
                             StringBuilder nfName = new StringBuilder(f);
                             int index = nfName.indexOf("_");
                             nfName.insert(index-1, "0");
                             if(file.renameTo(new File(dirName,
                                     nfName.toString()))){
                                 
                                 System.out.println("Rename successful: " + f + 
                                         " → " + nfName);
                                 break;
                                 
                             } else {
                                 
                                 System.out.println("Rename failed: " + f);
                                 break;
                             }
                         } else {
                             System.out.println("Number is two digits in: " + f);
                             break;
                         }
                     }
                 }
             }
        
        
    }
    //EXERCISE 12.27////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void replaceWords(){
        String dirName = "files/Directories";
        File file = new File(dirName);
        String[] dir = file.list();
        int i=1;
        for( String d: dir){
            String dirFileName = dirName+"/"+d;
            File dirFile = new File(dirFileName);
            if(dirFile.exists()){
                StringBuilder nDirFileName = new StringBuilder(dirFileName);
                int index = nDirFileName.indexOf("_");
                if(index > 2){
                    if(dirFile.renameTo(new File(nDirFileName.insert(
                            (index+1), "0").insert((index-1), "0"
                            ).toString()))){
                        System.out.println("Renamed Successful");
                    } else {
                        System.out.println("Rename failed");
                    }
                }
            } else {
                System.out.println("File does not exist");
            } 
            i++;
        }
    }
    
    //EXERCISE 12.26////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void createDirctory(){
        File file = new File("files/Directories");
        if(file.mkdirs()){
            System.out.println("Directory created successuflly");
        } else {
            System.out.println("Directory already exists");
        }
    }
    //EXERCISE 12.25////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void processDataSet(){
        double astSalary = getSumOfSalary(getSalaryFromFile(
                "assistant"));
        double astAvg = getAverageOfSalary(getSalaryFromFile(
                "assistant"));
        double asotSalary = getSumOfSalary(getSalaryFromFile(
                "associate"));
        double asotAvg = getAverageOfSalary(getSalaryFromFile(
                "associate"));
        double fltSalary = getSumOfSalary(getSalaryFromFile(
                "full"));
        double fltAvg = getAverageOfSalary(getSalaryFromFile(
                "full"));
        
        double totalSalary = astSalary + asotSalary + fltSalary;
        double totalAvg = totalSalary/3;
        
        System.out.println("Total salary for assistant professor is: "+astSalary);
        System.out.println("Average salary for assistant professor is: "+astAvg);
        
        System.out.println("\nTotal salary for associate professor is: "+asotSalary);
        System.out.println("Average salary for associate professor is: "+asotAvg);
        
        System.out.println("\nTotal salary for full professor is: "+fltSalary);
        System.out.println("Average salary for full professor is: "+fltAvg);
        
        System.out.println("\nTotal salary for all faculty is: "+totalSalary);
        System.out.println("Average salary for all faculty is: "+totalAvg);
        
        
    }
    
    private double getAverageOfSalary(ArrayList<String> list){
        double sum =0;
        for(Object o:list){
            sum += Double.parseDouble(o.toString());
        }
        return sum/list.size();
    }
    
    private double getSumOfSalary(ArrayList<String> list){
        double sum =0;
        for(Object o:list){
            sum += Double.parseDouble(o.toString());
        }
        return sum;  
    }
    
    private ArrayList<String> getSalaryFromFile(String rank){
        File file = new File("files/DataSet/Salary.txt");
        ArrayList<String> salaries = new ArrayList<>();
        try{
            Scanner reader = new Scanner(file);
             while(reader.hasNext()){
                 String line = reader.nextLine();
                 Scanner wordReader = new Scanner(line);
                   String word = "";
                 while(wordReader.hasNext()){
                     word = wordReader.next();
                     if(word.toLowerCase().equals(rank.toLowerCase())){
                         word = wordReader.next();
                         if(word.matches("\\d+(\\.\\d+)?")){
                             salaries.add(word);
                             break;
                         }
                     } 
                 }
                 wordReader.close(); 
             }
             reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: "+e.getMessage());
        }
        return salaries;
    }
    
    //EXERCISE 12.24////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void createDataset(){
        String fileName = "files/DataSet/Salary.txt";
         String firstName = "FirstName";
          String lastName = "LastName";
           String[] rank ={"assistant","associate","full"};
        double[][] salaryRange = {{50000,80000},{60000,110000},{75000,130000}};
          DecimalFormat df = new DecimalFormat("#.00");
            Random ran = new Random();
        
        File file = new File(fileName);
        try{
            PrintWriter writer = new PrintWriter(file);
              for(int i=1; i<=1000; i++){
                int ranPos = ran.nextInt(3);
                  double salary = salaryRange[ranPos][1]-salaryRange[ranPos][0];
                    salary = salaryRange[ranPos][0]+ ran.nextDouble(salary+1);
                 writer.println(firstName+i+"  "+lastName+i+"  "+rank[ranPos]+
                         "  "+df.format(salary));
              }
              writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not foud: "+e.getMessage());
        }
    }
    
    //EXERCISE 12.23////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void getTotalScore(){
        ArrayList scores = getScoresFromNet(
                "https://raw.githubusercontent.com/sahadevgh/"
                        + "student_score_processor/main/processed_scores.txt");
        int scoreCount = scores.size();
        double sumOfScores=0;
        File file = new File("files/Scores/testScores.txt");
        try(PrintWriter writer = new PrintWriter(file);){
            for(Object s:scores){
                sumOfScores += Double.valueOf(s.toString());
                writer.print(s.toString()+" ");
            }
            System.out.println("The total score is: "+sumOfScores+"\n"
                 + "The average Score is: "+(sumOfScores/scoreCount));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: "+e.getMessage());
        }
    }
    
    private ArrayList<String> getScoresFromNet(String netAddress){
        ArrayList<String> scores = new ArrayList<>();
        try{
            URL url = new URL(netAddress);
            Scanner reader = new Scanner(url.openStream());
            while(reader.hasNext()){
                String digits = reader.next().trim();
                if(digits.matches("Highest") || digits.matches("Lowest"
                        + "")){
                    break;
                }
                if(digits.matches("\\d+(\\.\\d+)?")){
                    scores.add(digits);
                }
            }
            reader.close();
        }
        catch(MalformedURLException e){
            System.out.println("Invalid url: "+e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        return scores;
    }
    
    //EXERCISE 12.22////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void ReplaceText(){
        String text ="command";
        String replacement ="command line";
        String folder ="files/replace";
        findText(text,replacement,folder);
    }
    
    private void findText(String originalText,String replacementText, 
            String folder){
        String[] files = getFiles(folder);
        for(String f:files){
            File file = new File(folder+"/"+f);
            StringBuilder content = new StringBuilder();
            try{
                Scanner reader = new Scanner(file);
                while(reader.hasNext()){
                    String word = reader.nextLine().replace(originalText,replacementText);
                    content.append(word).append(System.lineSeparator()); 
                }
                reader.close();
                PrintWriter writer = new PrintWriter(file);
                writer.print(content);
                writer.close();
            }
            catch(FileNotFoundException e){
                System.out.println("File not found "+file.getAbsolutePath());
            }
        }
    }
    
    private String[] getFile(String folder){
        File file = new File(folder);
       return file.list(); 
    }
    
    
    //EXERCISE 12.21////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void sortedString(){
        ArrayList<String> sortedContent = new ArrayList<>();
        ArrayList<String> originalContent = new ArrayList<>();
        File file = new File("files/SortedString.txt");
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String word= reader.next();
                originalContent.add(word);
                sortedContent.add(word);
            }
            
            Collections.sort(sortedContent);
            if(sortedContent.equals(originalContent)){
                System.out.println("The string is sorted in ascending order");
            } else {
                int count = 2;
                int element = 0;
                while (count > 0){
                    if(!sortedContent.get(element).equals(
                    originalContent.get(element))){
                        System.out.println(originalContent.get(element));
                        count--;
                    }
                    element++;
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found "+file.getAbsolutePath());
        }
    }
    
    //EXERCISE 12.20////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void removePackageStatement(){
        String fileName ="";
        String statement ="";
        for (int i=1; i<=34; i++){
            fileName = "files/srcRootDirectory/Chapter"+i;
            statement = "package chapter"+i+";";
            removePackage(fileName,getAllFiles(fileName),statement);
        }
    }
    
    
    private void removePackage(String fileName, String[] subFiles,String 
            statement){
        for(String f: subFiles){
            boolean firstLine = true;
            StringBuilder content = new StringBuilder();
            File file = new File((fileName+"/"+f));
            try{
                Scanner reader = new Scanner(file);
                while(reader.hasNext()){
                   String CurrentLine = reader.nextLine().trim();
                   if(firstLine && CurrentLine.equals(statement)){
                       firstLine = false;
                       continue;
                   }
                   content.append(CurrentLine).append(System.lineSeparator());
                }
                reader.close();
                PrintWriter writer = new PrintWriter(file);
                writer.print(content);
                writer.close();
            }
            catch(FileNotFoundException e){
                System.out.println("File not foud: "+e.getMessage());
            }
        }
    }
    
    private String[] getAllFiles(String fileName){
        File file = new File(fileName);
        return file.list();
    }
    
    private String[] getJFiles(String fileName){
        File file = new File(fileName);
        return file.list((dir,name)->name.endsWith(".java"));
    }
    
    //EXERCISE 12.19////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void countWords(){
        int wordCount=0;
        try{
            URL url = new URL("https://www.gutenberg.org/files/4/4-0.txt");
            Scanner reader = new Scanner(url.openStream());
            while(reader.hasNext()){
                reader.next();
                wordCount ++;
            }
            reader.close();
            System.out.println("President Abraham Lincoln’s Gettysburg address"
                    + "\n has "+wordCount+" words");
        }
        catch(MalformedURLException e){
            System.out.println("Malformed URL"+e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    //EXERCISE 12.18////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void addPackageStatement(){
        String packageStatement ="";
        String fileName ="";
        //String srcFile = "";
        for(int i=1; i<=34; i++){
            packageStatement = "package chapter"+i+";";
            fileName = "files/srcRootDirectory/Chapter"+i;
            try{
                addPackage(fileName,getFiles(fileName),
                        packageStatement);
            }
            catch(FileNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        
    }
    
    
    private void addPackage(String fileName,String[] subFiles,String statement)
            throws FileNotFoundException{
        for(String f: subFiles){
            String package_ = statement;
            String path = fileName+"/"+f;
            File file = new File(path);
            try{
                Scanner reader = new Scanner(file);
                while(reader.hasNext()){
                    package_ +="\n"+reader.nextLine()+" ";
                }
                reader.close();
                PrintWriter writer = new PrintWriter(file);
                writer.print(package_);
                writer.close();
            }
            catch(FileNotFoundException e){
                throw new FileNotFoundException("File not found: "+e.getMessage());
            }
        }
    }
    
    
    private String[] getFiles(String fileName){
        File file = new File(fileName);
        return file.list();
    }
    
    public void removeFiles(){
        String fileName ="";
        for(int i=1; i<=34; i++){
            fileName = "files/srcRootDirectory/chapter"+i+"/chapter"+i+".txt";
            File file = new File(fileName);
                file.delete();   
        }
    }
    

    public void removeJFiles(){
        String fileName ="";
        for(int i=1; i<=34; i++){
            fileName = "files/srcRootDirectory/chapter"+i+"/chapter"+i+".java";
            File file = new File(fileName);
                file.delete();
        }
    }
    
    public void createFiles(){
        String fileName ="";
        for(int i=1; i<=34; i++){
            //"files/Directories/directory"+i+"_"+i;
            //"files/Directories/Rename/directory"+i+"_"+i;
            fileName = "files/Directories/Rename/directory"+i+"_"+i;
                    //"files/srcRootDirectory/Chapter"+i+"/Chapter"+i+".txt";
            File file = new File(fileName);
            try{
                file.createNewFile();
            }
            catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
    
    public void createJFiles(){
        String fileName ="";
        for(int i=1; i<=34; i++){
            fileName ="files/srcRootDirectory/Chapter"+i+"/Chapter"+i+".java";
            File file = new File(fileName);
            try{
                file.createNewFile();
            }
            catch(IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
    
    //EXERCISE 12.17////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void hangman(){
        Scanner input = new Scanner(System.in);
        String word ="";
        try{
            word = guessWord();
        }
        catch(FileNotFoundException e){
            System.out.print(e.getMessage());
        }
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
                System.out.println("You got it correct");
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


    public String guessWord()throws FileNotFoundException{
        ArrayList<String> words = new ArrayList<>();
        String word ="";
        File file = new File("files/hangman.txt");
        int count =0;
        
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                words.add(reader.next());
                count++;
            }
            reader.close();
        }  
        catch(FileNotFoundException e){
            throw new FileNotFoundException("File not found: "+
                    file.getAbsolutePath());
        }
        return words.get((int)(0+Math.random()*count));
    }
    
    //EXERCISE 12.16////////////////////////////////////////////
    /////////////////////////////////////////////////////////// 
    public void replaceText(String text,File file){
        String line="";
        try{
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                line += reader.nextLine()+"\n"; 
            }
            reader.close();
            PrintWriter writer = new PrintWriter(file);
            writer.print(line.replace(text, ""));
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }  
    }
    
    //EXERCISE 12.15////////////////////////////////////////////
    /////////////////////////////////////////////////////////// 
    public void readOrWriteData(){
        try{
            writeData("files/Exercise12_15.txt");
            readData("files/Exercise12_15.txt");
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    private void writeData(String fileName)throws FileNotFoundException{
            File file = new File(fileName);
            String data = "";
        try{
            PrintWriter writer = new PrintWriter(file);
            for (int i=1; i<=100; i++){
                data = (int)(1+Math.random()*100)+" ";
                writer.append(data);
                if(i>0 && i%10==0){
                    writer.append(System.lineSeparator());
                    data +="\n";
                }
                System.out.print(data);
            } 
            writer.close(); 

        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException("File not found"
                    + ""+file.getAbsolutePath());
        }
    }
    
    private void readData(String fileName) throws FileNotFoundException{
        System.out.println("\nReading Data from "+fileName);
        File file = new File(fileName);
        ArrayList<String> data = new ArrayList<>();
        try{
            Scanner reader = new Scanner(file);
            int count =0;
            while(reader.hasNext()){
                String line =reader.next();
                data.add(line+" ");
                count++;
                if(count>0 && count%10==0){
                    data.add("\n");
                }
            }
            reader.close();
            Collections.reverse(data);
            for(String s: data){
                System.out.print(s);
            }
 
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException("File not found"
                    + ""+file.getAbsolutePath());
        }
    }
    //EXERCISE 12.14////////////////////////////////////////////
    /////////////////////////////////////////////////////////// 
    public void getScores(){
        System.out.println("Enter file name eg: Kofi.txt");
        File file = new File(new String(new Scanner(System.in).next()));
        int total =0;
        double count =0;
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                count++;
                total += reader.nextInt();
            }
            reader.close();
            System.out.println("Total Scores: "+total+"\n"
                    + "Average Score: "+(total/count));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found "+file.getAbsolutePath());
        }
    }
    
    //EXERCISE 12.13////////////////////////////////////////////
    /////////////////////////////////////////////////////////// 
    public void count_L_W_C(File file){
        try{
            System.out.println("File "+file.getName()+" has:\n"
                    + countChars(file)+" Characters\n"
                            + countWords(file)+" Words \n"
                                    + countLines(file)+" Lines");
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
         
    }
    
    private int countChars(File file)throws FileNotFoundException{
        int chars =0;
        StringBuilder text = new StringBuilder();
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                text.append(reader.nextLine());
            }
            reader.close();
            chars = text.length();
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException("File not Found "
                    + ""+file.getAbsolutePath());
        }
        return chars;
    }
    
    private int countWords(File file )throws FileNotFoundException{
        int words =0; 
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                words++;
                reader.next();
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException("File not found "
                    + ""+file.getAbsolutePath());
        }
        
        return words;
    }
    
    private int countLines(File file)throws FileNotFoundException{
        int lines =0;
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                lines++;
                reader.nextLine();
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException("File not found "
                    + ""+file.getAbsolutePath());
        }
        return lines;
    }
    
    //EXERCISE 12.12////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void reFormatCode(File file){
        StringBuilder text = new StringBuilder();
        int space =0;
        quickFormat(file);
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String letter = reader.next();
                if(letter.equals("{")){
                    text.append(letter+"\n").append(System.lineSeparator());
                    space +=3;
                    for(int i=1; i<=space; i++){
                        text.append(" ");
                    } 
                } else if(letter.equals("}")){
                    space -=3;
                    text.append(System.lineSeparator());
                    for(int i=1; i<=space; i++){
                        text.append(" ");
                    }
                    text.append(letter);
                    
                } else {
                        text.append(letter +" ");

                }
                
            }
            reader.close();
            PrintWriter writer = new PrintWriter(file);
            writer.println(text.toString());
            writer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: "+file.getAbsolutePath());
        }
        
    }
    
    private void quickFormat(File file){
        StringBuilder text = new StringBuilder();
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                text.append(line.replace("}", " } "
                        + "").replace("{", " { "));
                
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    
    //EXERCISE 12.11////////////////////////////////////////////
    ///////////////////////////////////////////////////////////
    public void removeText(String text, File file){
       try{
           String str =getText(file);
           writeText(str.replace(text, ""),file);
       }
       catch(FileNotFoundException e){
           System.out.println("File not found!");
       }
    }
    
    private String getText(File file)throws FileNotFoundException{
        String text = "";
        try(
                Scanner reader = new Scanner(file);){
            
            while(reader.hasNext()){
                text += reader.nextLine();
            }
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException("File not found");
        }
        return text;
    }
    
    public void writeText(String text, File file)throws FileNotFoundException{
        try(
                PrintWriter writer = new PrintWriter(file);){
            
            writer.write(text);
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException("File not found");
        }
    }
    
    //EXERCISE 12.10////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    
    public void outOfMem()throws OutOfMemoryError{
        List<int[]> outOfMemory = new ArrayList<>();
        try{
                      while(true){
              outOfMemory.add(new int[1000000]);
          }
        }
        catch(OutOfMemoryError e){
            throw new OutOfMemoryError("Out of memory");
        }
    }
    
    //EXERCISE 12.5 IS CREATED AS A CLASS /////////////////////
    //////////////////////////////////////////////////////////
    
    
    //EXERCISE 12.8 IS CREATED AS A CLASS /////////////////////
    //////////////////////////////////////////////////////////
    
    
    //EXERCISE 12.7////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    public int bin2Dec(String bin) throws NumberFormatException{
        if(!isBinary(bin)){
            throw new BinaryFormatException();
        }
        
        int decimal=0;
        int len = bin.length();
        int value =0;
        for (int i=0; i<len; i++){
            value = Character.getNumericValue(bin.charAt(i));
            decimal += value*(Math.pow(2, (len-1-i)));
        }
        return decimal;
    }
    
    
    public boolean isBinary(String number){
        for( char c:number.toCharArray()){
            if((Character.getNumericValue(c)<0 || 
                    Character.getNumericValue(c)>1)){
                return false;
            }
        }
        return true;
    }
    
    //EXERCISE 12.6////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    public double hex2Dec(String number) throws NumberFormatException {
        if (!isHex(number)) {
            throw new HextFormatException();
        }   

        double decimal = 0;
        int len = number.length();

        for (int i = 0; i < len; i++) {
            char c = number.charAt(i);
            int value = Character.getNumericValue(c);
            decimal += value * Math.pow(16, len - 1 - i);
        }

        return decimal;
    }

    
    public boolean isHex(String number){
        boolean isHex = true;
        int len = number.length();
        for(int i=0; i<len; i++){
            int value = Character.getNumericValue(number.charAt(i));
            if(value<0 || value>15){
                isHex = false;
                return isHex;
            }
        }
        return isHex;
    }
    
    
    
    //EXERCISE 12.5 IS CREATED AS A CLASS /////////////////////
    //////////////////////////////////////////////////////////
    
    
    
    //EXERCISE 12.4 IS CREATED AS A CLASS /////////////////////
    //////////////////////////////////////////////////////////
    
    
    //EXERCISE 12.3////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    public static void findValueAt(){
        System.out.print("Enter Array Index: ");
        int index = new Scanner(System.in).nextInt();
        int[] ar = createAr(100);
        try{
            System.out.println("Value at index "+index+" is "+ar[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");        
        }

    }
    
    private static int[] createAr(int size){
        int[] ar = new int[size];
        
        for(int i=0; i<ar.length; i++){
            ar[i] = (int)(0+Math.random()*(ar.length));
        }
        return ar;
    }
    
    //EXERCISE 12.2////////////////////////////////////////////
    //////////////////////////////////////////////////////////
    public static void sum(){
        System.out.println("Enter two integers");
        Scanner input = new Scanner (System.in);
        try{
          int a = input.nextInt();
          int b = input.nextInt();
          System.out.println(a+" + "+b+" = "+(a+b));
        } 
        catch(InputMismatchException e){
            System.out.println("Wrong input. Please try again.\n");
            sum();
        }
        
    }
    
    
    //EXERCISE 12.1////////////////////////////////////////////
    ////////////////////////////////////////////////////////
  public static void calculator(){
        int a=0;
        int b=0;
        try{
            System.out.println("Enter two integers: ");
            Scanner input =new Scanner(System.in);
            a = input.nextInt();
            b = input.nextInt();
            System.out.println(a+ " + "+b+ " = "+(a+b));
        }
        catch(InputMismatchException e){
            System.out.println("Your entered a wrong input.\n");
            calculator();
        } 
    }
    
    public static void calculatorWithIf(){
        String a;
        String b;
        System.out.println("Enter inputs: ");
        Scanner input = new Scanner (System.in);
        a = input.next();
        if(a.matches("\\d")){
            b = input.next();
            if(b.matches("\\d")){
                int num1 = Integer.valueOf(a);
                int num2 = Integer.valueOf(b);
                System.out.println(a+" + "+b+" = "+(a+b));  
            } else {
                System.out.println("wrong input: "+b);
                calculatorWithIf();
            }
        } else {
            System.out.println("wrong input: "+a);
            calculatorWithIf();
        }
        
    }
}
