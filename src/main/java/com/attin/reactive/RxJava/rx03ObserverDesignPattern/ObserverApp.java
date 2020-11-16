package com.attin.reactive.RxJava.rx03ObserverDesignPattern;

public class ObserverApp {

    public static void main(String[] args) {

        Book book = new Book("Goosebumps", "Horror", "Xy", 200, "Sold-Out");

        EndUser attin = new EndUser("Attin", book);
        EndUser emel = new EndUser("Emel", book);

        book.setInStock("In-Stock");

    }
}
