package com.attin.reactive.r7DesingPatterns.decorator;

import com.attin.reactive.r6FunctionalProgramming.composition.Function;

public class BurgerShop {

    private Function<Burger, Burger> decorator;

    public BurgerShop(Function<Burger, Burger> decorator) {
        this.decorator = decorator;
    }

    public Burger use(Burger baseBurger) {
        System.out.println("Base Burger : " + baseBurger);
        return decorator.apply(baseBurger);
    }
}
