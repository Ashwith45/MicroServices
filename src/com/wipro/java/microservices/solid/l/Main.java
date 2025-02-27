package com.wipro.java.microservices.solid.l;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 10);
        Shape shape2 = new Square(7);

        System.out.println("Area of Rectangle: " + shape1.area());
        System.out.println("Area of Square: " + shape2.area());
    }
}