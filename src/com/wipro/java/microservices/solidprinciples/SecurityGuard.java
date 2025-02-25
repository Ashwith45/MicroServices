package com.wipro.java.microservices.solidprinciples;

 public  class SecurityGuard extends Employee implements Maintainable {
	    public SecurityGuard(String name, int id) {
	        super(name, id);
	    }

	    public void patrol() {
	        System.out.println(name + " is patrolling the premises.");
	    }

	    @Override
	    public void maintain() {
	        System.out.println(name + " is maintaining security logs.");
	    }
	}
