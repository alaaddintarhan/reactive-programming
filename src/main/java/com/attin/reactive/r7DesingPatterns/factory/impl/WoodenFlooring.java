package com.attin.reactive.r7DesingPatterns.factory.impl;

import com.attin.reactive.r7DesingPatterns.factory.Flooring;

public class WoodenFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The Wooden flooring is installed! ");
    }
}
