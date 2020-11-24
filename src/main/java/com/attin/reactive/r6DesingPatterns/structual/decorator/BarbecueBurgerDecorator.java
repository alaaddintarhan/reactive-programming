package com.attin.reactive.r6DesingPatterns.structual.decorator;

public class BarbecueBurgerDecorator extends BurgerDecorator {

    public BarbecueBurgerDecorator(Burger burger) {
        super(burger);
    }

    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", vegetables and cheese added.");
    }


}
