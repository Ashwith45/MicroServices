package com.wipro.java.microservices.solidprinciples;

public class Developer extends Employee implements Workable {
    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }
}


