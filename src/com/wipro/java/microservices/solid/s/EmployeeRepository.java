package com.wipro.java.microservices.solid.s;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
        loadEmployees();
    }

    private void loadEmployees() {
        employees.add(new Employee("Rohit", 50000));
        employees.add(new Employee("Gill", 60000));
        employees.add(new Employee("Virat", 55000));
        employees.add(new Employee("Shreyas", 65000));
        employees.add(new Employee("Rahul", 70000));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
