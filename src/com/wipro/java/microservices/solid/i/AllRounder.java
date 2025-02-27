package com.wipro.java.microservices.solid.i;

public class AllRounder implements Batsman , Bowler {
	public void bat() {
        System.out.println("All-rounder is batting...");
    }

    public void bowl() {
        System.out.println("All-rounder is bowling...");
    }

}
