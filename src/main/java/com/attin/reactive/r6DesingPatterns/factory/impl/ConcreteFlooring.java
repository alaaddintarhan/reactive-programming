package com.attin.reactive.r6DesingPatterns.factory.impl;

import com.attin.reactive.r6DesingPatterns.factory.Flooring;

public class ConcreteFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The ConcreteFlooring flooring is installed! ");
    }
}
