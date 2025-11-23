/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int nofStudents=0;
    
    Course(String name){
        this.courseName = name;
    }
    
    public void addStudent(String name){
        students[this.nofStudents] = name;
        this.nofStudents++;
    }
    
    public String[] getStudents(){
        return this.students;
    }
    
    public int getNumberOfStudents(){
        return this.nofStudents;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void dropStudents(String student){
        int temp=0;
        while (this.students[temp] != student){
            temp++;
        }
        
        while (temp < this.nofStudents){
            this.students[temp] = this.students[++temp];
        }
        this.nofStudents--;
    } 
}
