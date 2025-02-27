package com.wipro.java.microservices.solid.o;
public class BookDetails {
    private final Book book = new Book() {
        @Override
        public void display() {
            System.out.println("Title: " + Book.title);
            System.out.println("Author: " + Book.author);
        }
    };

    public void showBookDetails() {
        book.display();
    }
}
    



