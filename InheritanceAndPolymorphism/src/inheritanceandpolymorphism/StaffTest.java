/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class StaffTest {

    public void testDefaultConstructor() {
        Staff staff = new Staff();
        Methods.print(staff.toString());
    }

    public void testParameterizedConstructor() {
        Staff staff = new Staff("Manager", "Office A", 60000.0, "John Doe", "123 Main St", "123-456-7890", "john@example.com");
        Methods.print(staff.getTitle());
        Methods.print(staff.getOffice());
        Methods.print(String.valueOf(staff.getSalary()));
        Methods.print(staff.getName());
        Methods.print(staff.getAddress());
        Methods.print(staff.getPhone());
        Methods.print(staff.getEmail());
        Methods.newLine();
    }

    public void testSettersAndGetters() {
        Staff staff = new Staff();
        staff.setTitle("Supervisor");
        staff.setOffice("Office B");
        staff.setSalary(75000.0);
        staff.setName("Jane Doe");
        staff.setAddress("456 Oak St");
        staff.setPhone("987-654-3210");
        staff.setEmail("jane@example.com");

        Methods.print(staff.getTitle());
        Methods.print(staff.getOffice());
        Methods.print(String.valueOf(staff.getSalary()));
        Methods.print(staff.getName());
        Methods.print(staff.getAddress());
        Methods.print(staff.getPhone());
        Methods.print(staff.getEmail());
        Methods.newLine();
    }

    public void testToString() {
        Staff staff = new Staff("Assistant", "Office C", 50000.0, "Alice", "789 Pine St", "555-555-5555", "alice@example.com");
        Methods.print(staff.toString());
        Methods.newLine();
    }
}
