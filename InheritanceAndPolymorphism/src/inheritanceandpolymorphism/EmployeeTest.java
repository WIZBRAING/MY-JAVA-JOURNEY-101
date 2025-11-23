/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */
public class EmployeeTest {

    public void testDefaultConstructor() {
        Employee employee = new Employee();
        Methods.print(employee.getDateHired().toString());
        Methods.newLine();
    }

    public void testParameterizedConstructor() {
        Employee employee = new Employee("Office A", 50000.0, "John Doe", "123 Main St", "123-456-7890", "john@example.com");
        Methods.print(employee.getOffice());
        Methods.print(String.valueOf(employee.getSalary()));
        Methods.print(employee.getName());
        Methods.print(employee.getAddress());
        Methods.print(employee.getPhone());
        Methods.print(employee.getEmail());
        Methods.print(employee.getDateHired().toString());
        Methods.newLine();
    }

    public void testSettersAndGetters() {
        Employee employee = new Employee();
        employee.setOffice("Office B");
        employee.setSalary(75000.0);
        employee.setName("Jane Doe");
        employee.setAddress("456 Oak St");
        employee.setPhone("987-654-3210");
        employee.setEmail("jane@example.com");

        Methods.print(employee.getOffice());
        Methods.print(String.valueOf(employee.getSalary()));
        Methods.print(employee.getName());
        Methods.print(employee.getAddress());
        Methods.print(employee.getPhone());
        Methods.print(employee.getEmail());
        Methods.newLine();
    }

    public void testToString() {
        Employee employee = new Employee("Office C", 60000.0, "Alice", "789 Pine St", "555-555-5555", "alice@example.com");
        Methods.print(employee.toString());
        Methods.newLine();
    }
}
