package com.wipro.java.microservices.solidprinciples;

public class Technician extends Employee implements Workable, Maintainable {
    public Technician(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println(name + " is repairing systems.");
    }

    public void maintain() {
        System.out.println(name + " is performing system maintenance.");
    }
}
