package com.attin.reactive.r6DesingPatterns.factory.impl;

import com.attin.reactive.r6DesingPatterns.factory.Flooring;

public class CorkFlooring implements Flooring {
    @Override
    public void installation() {
        System.out.println("The Cork flooring is installed! ");
    }
}
