package com.attin.reactive.r6DesingPatterns.creational.factory.flooringFactory.impl;

import com.attin.reactive.r6DesingPatterns.creational.factory.flooringFactory.Flooring;

public class ConcreteFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The ConcreteFlooring flooring is installed! ");
    }
}
