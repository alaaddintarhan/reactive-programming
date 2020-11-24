package com.attin.reactive.r6DesingPatterns.structual.decorator;


public abstract class BurgerDecorator extends PlainBurger {

    protected  Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    public void makeBurger() {
        burger.makeBurger();
    }


}
