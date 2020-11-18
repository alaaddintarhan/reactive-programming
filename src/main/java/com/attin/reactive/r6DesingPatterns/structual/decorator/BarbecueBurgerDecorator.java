package com.attin.reactive.r6DesingPatterns.structual.decorator;

import com.attin.reactive.r10DesignPatterns.structual.decorator.Burger;
import com.attin.reactive.r10DesignPatterns.structual.decorator.BurgerDecorator;

public class BarbecueBurgerDecorator extends BurgerDecorator {

    public BarbecueBurgerDecorator(Burger burger) {
        super(burger);
    }

    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", vegetables and cheese added.");
    }


}
