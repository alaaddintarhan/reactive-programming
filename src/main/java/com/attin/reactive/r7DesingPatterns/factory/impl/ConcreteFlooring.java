package com.attin.reactive.r7DesingPatterns.factory.impl;

import com.attin.reactive.r7DesingPatterns.factory.Flooring;

public class ConcreteFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The ConcreteFlooring flooring is installed! ");
    }
}
