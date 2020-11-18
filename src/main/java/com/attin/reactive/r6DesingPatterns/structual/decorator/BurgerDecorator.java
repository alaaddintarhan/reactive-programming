package com.attin.reactive.r6DesingPatterns.structual.decorator;

import com.attin.reactive.r10DesignPatterns.structual.decorator.Burger;
import com.attin.reactive.r10DesignPatterns.structual.decorator.PlainBurger;

public abstract class BurgerDecorator extends PlainBurger {

    protected com.attin.reactive.r10DesignPatterns.structual.decorator.Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    public void makeBurger() {
        burger.makeBurger();
    }


}
