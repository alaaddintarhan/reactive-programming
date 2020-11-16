package com.attin.reactive.r7DesingPatterns.factory;

public class FactoryApp {

    public static void main(String[] args) {

        Flooring floor = FlooringFactory.getFlooring(3,45);

        floor.installation();;
    }
}
