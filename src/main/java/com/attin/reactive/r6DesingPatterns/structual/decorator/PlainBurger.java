package com.attin.reactive.r6DesingPatterns.structual.decorator;

public class PlainBurger implements Burger {

    @Override
    public void makeBurger() {
        System.out.print("\nPlain Burger is ready ");
    }
}
