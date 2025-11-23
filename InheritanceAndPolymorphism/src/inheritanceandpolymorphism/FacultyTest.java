/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class FacultyTest {

    public void testDefaultConstructor() {
        Faculty faculty = new Faculty();
        Methods.print(faculty.getRank());
        Methods.print(String.valueOf(faculty.getOfficeHours()));
    }

    public void testParameterizedConstructor() {
        Faculty faculty = new Faculty("Professor", 10, "Office A", 80000.0, "John Doe", "123 Main St", "123-456-7890", "john@example.com");
        Methods.print(faculty.getRank());
        Methods.print(String.valueOf(faculty.getOfficeHours()));
        Methods.print(faculty.getOffice());
        Methods.print(String.valueOf(faculty.getSalary()));
        Methods.print(faculty.getName());
        Methods.print(faculty.getAddress());
        Methods.print(faculty.getPhone());
        Methods.print(faculty.getEmail());
        Methods.newLine();
    }

    public void testSettersAndGetters() {
        Faculty faculty = new Faculty();
        faculty.setRank("Associate Professor");
        faculty.setOfficeHours(15);
        faculty.setOffice("Office B");
        faculty.setSalary(90000.0);
        faculty.setName("Jane Doe");
        faculty.setAddress("456 Oak St");
        faculty.setPhone("987-654-3210");
        faculty.setEmail("jane@example.com");

        Methods.print(faculty.getRank());
        Methods.print(String.valueOf(faculty.getOfficeHours()));
        Methods.print(faculty.getOffice());
        Methods.print(String.valueOf(faculty.getSalary()));
        Methods.print(faculty.getName());
        Methods.print(faculty.getAddress());
        Methods.print(faculty.getPhone());
        Methods.print(faculty.getEmail());
        Methods.newLine();
    }

    public void testToString() {
        Faculty faculty = new Faculty("Lecturer", 20, "Office C", 70000.0, "Alice", "789 Pine St", "555-555-5555", "alice@example.com");
        Methods.print(faculty.toString());
        Methods.newLine();
    }
}
