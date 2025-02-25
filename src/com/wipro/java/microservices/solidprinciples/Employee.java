package com.wipro.java.microservices.solidprinciples;

abstract class Employee {
	protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showDetails() {
        System.out.println(getClass().getSimpleName() + ": " + name + " (ID: " + id + ")");
    }

	

}
