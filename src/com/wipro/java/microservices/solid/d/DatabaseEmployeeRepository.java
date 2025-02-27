package com.wipro.java.microservices.solid.d;

public class DatabaseEmployeeRepository implements EmployeeRepository {
	public void saveEmployee(String name) {
        System.out.println("Saving " + name + " to the database.");
    }
}
