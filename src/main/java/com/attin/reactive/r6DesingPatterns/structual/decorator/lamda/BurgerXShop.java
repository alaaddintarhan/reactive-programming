package com.attin.reactive.r6DesingPatterns.structual.decorator.lamda;

import com.attin.reactive.r5FunctionalProgramming.composition.Function;

public class BurgerXShop {

    private Function<BurgerX, BurgerX> decorator;

    public BurgerXShop(Function<BurgerX, BurgerX> decorator) {
        this.decorator = decorator;
    }

    public BurgerX use(BurgerX baseBurger) {
        System.out.println("Base Burger : " + baseBurger);
        return decorator.apply(baseBurger);
    }
}
