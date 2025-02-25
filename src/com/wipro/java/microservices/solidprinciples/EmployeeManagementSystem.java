package com.wipro.java.microservices.solidprinciples;

public class EmployeeManagementSystem {
	 public static void main(String[] args) {
	        EmployeeRepository repository = new EmployeeRepository();

	        repository.addEmployee(new Developer("Alice", 101));
	        repository.addEmployee(new Manager("Bob", 102));
	        repository.addEmployee(new SecurityGuard("Charlie", 103));
	        repository.addEmployee(new Accountant("David", 104));
	        repository.addEmployee(new Technician("Eve", 105));

	        for (Employee emp : repository.getEmployees()) {
	            emp.showDetails();
	            executeTasks(emp);
	            System.out.println();
	        }
	    }

	    private static void executeTasks(Employee emp) {
	        if (emp instanceof Workable) {
	            ((Workable) emp).work();
	        }
	        if (emp instanceof Reportable) {
	            ((Reportable) emp).report();
	        }
	        if (emp instanceof Maintainable) {
	            ((Maintainable) emp).maintain();
	        }
	        if (emp instanceof SecurityGuard) {
	            ((SecurityGuard) emp).patrol();
	        }
	    }

}
