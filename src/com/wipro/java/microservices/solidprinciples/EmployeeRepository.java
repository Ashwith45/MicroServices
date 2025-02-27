package com.wipro.java.microservices.solidprinciples;

import java.util.ArrayList;
import java.util.List;

class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}