package com.attin.reactive.r6DesingPatterns.factory.impl;

import com.attin.reactive.r6DesingPatterns.factory.Flooring;

public class WoodenFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The Wooden flooring is installed! ");
    }
}
