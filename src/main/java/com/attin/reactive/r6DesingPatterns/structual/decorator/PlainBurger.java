package com.attin.reactive.r6DesingPatterns.structual.decorator;

import com.attin.reactive.r10DesignPatterns.structual.decorator.Burger;

public class PlainBurger implements Burger {

    @Override
    public void makeBurger() {
        System.out.print("\nPlain Burger is ready ");
    }
}
