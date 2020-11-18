package com.attin.reactive.r6DesingPatterns.structual.decorator;

import com.attin.reactive.r10DesignPatterns.structual.decorator.Burger;
import com.attin.reactive.r10DesignPatterns.structual.decorator.BurgerDecorator;

public class CheeseBurgerDecorator extends BurgerDecorator {

    public CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", cheese added.");
    }


}
