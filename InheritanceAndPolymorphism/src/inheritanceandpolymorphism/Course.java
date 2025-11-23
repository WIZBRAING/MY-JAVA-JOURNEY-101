/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;
/**
 *
 * @author WIZBRAIN
 */
public class Course {
    private String courseName;
    private java.util.ArrayList<String> students;
    
    public Course(){
       this.students = new java.util.ArrayList();
    }
    
    public Course(String courseName){
       this.students = new java.util.ArrayList();
        this.courseName = courseName;
    }
    
    public Course(String courseName, String student){
       this.students = new java.util.ArrayList();
        this.courseName = courseName;
        this.students.add(student);
    }
    
    public void addStudent(String student){
        this.students.add(student);
    }
    
    public String getstudent(){
        return this.students.toString().trim();
    }
    
    public int getIndexOfStudent(String name){
        return this.students.indexOf(name);
    }
    
    public int getNumberOfStudents(){
        return this.students.size();
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void dropStudents(){
        this.students.clear();
    }
    
    public void removeStudent(String name){
        this.students.remove(name);
    }
    
    public boolean containStudent(String name){
        return this.students.contains(name);
    }
    
    public String findStudent(int i){
        return this.students.get(i);
    }
    
    
}
