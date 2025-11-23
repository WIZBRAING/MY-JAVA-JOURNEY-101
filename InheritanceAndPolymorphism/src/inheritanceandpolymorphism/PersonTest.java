/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceandpolymorphism;

/**
 *
 * @author WIZBRAIN
 */

public class PersonTest {

    
    public void testDefaultConstructor() {
        Person person = new Person();
        Methods.print(person.getName());
        Methods.print(person.getAddress());
        Methods.print(person.getPhone());
        Methods.print(person.getEmail());
        Methods.newLine();
    }


    public void testParameterizedConstructor() {
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john@example.com");
        Methods.print(person.getName());
        Methods.print(person.getAddress());
        Methods.print(person.getPhone());
        Methods.print(person.getEmail());
        Methods.newLine();
    }


    public void testSettersAndGetters() {
        Person person = new Person();
        person.setName("Jane Doe");
        person.setAddress("456 Oak St");
        person.setPhone("987-654-3210");
        person.setEmail("jane@example.com");

        Methods.print(person.getName());
        Methods.print(person.getAddress());
        Methods.print(person.getPhone());
        Methods.print(person.getEmail());
        Methods.newLine();
    }


    public void testToString() {
        Person person = new Person("Alice", "789 Pine St", "555-555-5555", "alice@example.com");
        Methods.print(person.toString());
        Methods.newLine();
    }
}

