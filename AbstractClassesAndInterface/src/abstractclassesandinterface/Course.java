/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclassesandinterface;
import java.util.ArrayList;
/**
 *
 * @author WIZBRAIN
 */
public class Course implements Cloneable {
    private String courseName;
    private ArrayList<String> students;
    
    public Course(){
        this("Computer Science");
    }
    
    public Course(String name){
        this.courseName =name;
        students = new ArrayList<>();
    }

    public void addStudent(String name){
        this.students.add(name);
    }
    
    public void getCourse(){
        System.out.println(this.courseName);
    }
    
    
    public int getNumberOfStudents(){
        return this.students.size();
    }
    
    public String getStudent(int position){
        return this.students.get(position);
    }
    
    public String getAllStudents(){
        String students = "";
        for(int i=0; i<this.getNumberOfStudents(); i++){
            students += this.students.get(i) +"\n";
        }
        return students;
    }
    
    public void removeStudentAt(int position){
        this.students.remove(position);
    }
    
    public void removeStudent(String name){
        this.students.remove(this.students.indexOf(name));
    }
    
    public void removeAllStudents(){
        for(int i=0; i<this.getNumberOfStudents(); i++){
            this.students.remove(i);
        }
    }
    
    @Override
    public Course clone()throws CloneNotSupportedException{
        Course o = (Course) super.clone();
        o.students = (ArrayList)this.students.clone();
        return o;
    }
}
