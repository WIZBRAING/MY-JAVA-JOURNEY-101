/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

/**
 *
 * @author WIZBRAIN
 */
public class Course1 {
    private String courseName;
    private String[] students = new String[100];
    private int numOfStudents;

    Course1(String name){
        this.courseName = name;
    }

    public void addStudents(String student){
        if (this.numOfStudents >= this.students.length) {
            String[] temp = new String[this.students.length * 2];
            System.arraycopy(this.students, 0, temp, 0, this.students.length);
            this.students = temp;
        }

        this.students[this.numOfStudents++] = student;
    }

    public void dropStudent(String name){
        int temp = 0;
        // searching to find student in the student list
        while (temp < this.students.length && !this.students[temp].equals(name)) {
            temp++;
        }

        // removing student from student list
        if (temp < this.students.length) {
            this.students[temp] = null;
            // reducing the number of students
            this.numOfStudents--;
            // creating temporal student list
            String[] tempStudents = new String[this.students.length];
            // Copying the remaining students to the new list
            int index = 0;
            for (int i = 0; i < this.students.length; i++) {
                // excluding null values from being copied into the new array
                if (this.students[i] != null) {
                    tempStudents[index++] = this.students[i];
                }
            }
            // Assigning the new array to the old
            this.students = tempStudents;
        }
    }

    public String[] getStudents(){
        String[] temp = new String[this.numOfStudents];
        int countStudents = 0;
        for (int i = 0; i < this.numOfStudents; i++) {
            if (this.students[i] == null) {
                continue;
            }
            temp[countStudents++] = this.students[i];
        }

        return temp;
    }

    public int getNumOfStudents(){
        return this.numOfStudents;
    }

    public String getCourseName(){
        return this.courseName;
    }
}//END OF CLASS COURSE1
