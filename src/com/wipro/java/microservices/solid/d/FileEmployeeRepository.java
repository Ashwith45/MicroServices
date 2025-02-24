package com.wipro.java.microservices.solid.d;

public class FileEmployeeRepository implements EmployeeRepository {
    public void saveEmployee(String name) {
        System.out.println("Saving " + name + " to a file.");
    }
}
