/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class StudentTest {

    public void testDefaultConstructor() {
        Student student = new Student();
        Methods.print(student.getStatus());
        Methods.print(student.getName());
        Methods.print(student.getAddress());
        Methods.print(student.getPhone());
        Methods.print(student.getEmail());
        Methods.newLine();
    }

    public void testParameterizedConstructor() {
        Student student = new Student("Sophomore", "John Doe", "123 Main St", "123-456-7890", "john@example.com");
        Methods.print(student.getStatus());
        Methods.print(student.getName());
        Methods.print(student.getAddress());
        Methods.print(student.getPhone());
        Methods.print(student.getEmail());
        Methods.newLine();
    }

    public void testSettersAndGetters() {
        Student student = new Student();
        student.setStatus("Senior");
        student.setName("Jane Doe");
        student.setAddress("456 Oak St");
        student.setPhone("987-654-3210");
        student.setEmail("jane@example.com");

        Methods.print(student.getStatus());
        Methods.print(student.getName());
        Methods.print(student.getAddress());
        Methods.print(student.getPhone());
        Methods.print(student.getEmail());
        Methods.newLine();
    }

    public void testToString() {
        Student student = new Student("Freshman", "Alice", "789 Pine St", "555-555-5555", "alice@example.com");
        Methods.print(student.toString());
        Methods.newLine();
    }
}
