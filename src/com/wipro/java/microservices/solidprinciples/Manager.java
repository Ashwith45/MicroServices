package com.wipro.java.microservices.solidprinciples;

public class Manager extends Employee implements Workable, Reportable {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }

    @Override
    public void report() {
        System.out.println(name + " is preparing reports.");
    }
}