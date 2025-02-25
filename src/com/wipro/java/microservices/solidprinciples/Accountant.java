package com.wipro.java.microservices.solidprinciples;

public class Accountant extends Employee implements Reportable {
    public Accountant(String name, int id) {
        super(name, id);
    }

    public void report() {
        System.out.println(name + " is preparing financial reports.");
    }
}
