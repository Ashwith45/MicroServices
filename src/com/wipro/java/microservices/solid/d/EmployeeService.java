package com.wipro.java.microservices.solid.d;

public class EmployeeService {

	private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void addEmployee(String name) {
        repository.saveEmployee(name);
        System.out.println("Employee " + name + " added.");
    }

    public static void main(String[] args) {
        EmployeeRepository dbRepository = new DatabaseEmployeeRepository();
        EmployeeRepository fileRepository = new FileEmployeeRepository();

        EmployeeService dbService = new EmployeeService(dbRepository);
        dbService.addEmployee("John Doe");

        EmployeeService fileService = new EmployeeService(fileRepository);
        fileService.addEmployee("Jane Smith");
    }
}
