package com.attin.reactive.r6DesingPatterns.creational.builder;

public class BuilderDesignPattern {

    public static void main(String[] args) {

        Mobile m = Manufacturer.createCompletedObject();

        System.out.println(m);
    }
}
