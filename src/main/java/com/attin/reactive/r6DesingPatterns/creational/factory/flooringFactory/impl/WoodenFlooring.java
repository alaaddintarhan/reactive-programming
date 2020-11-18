package com.attin.reactive.r6DesingPatterns.creational.factory.flooringFactory.impl;

import com.attin.reactive.r6DesingPatterns.creational.factory.flooringFactory.Flooring;

public class WoodenFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The Wooden flooring is installed! ");
    }
}
