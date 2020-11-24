package com.attin.reactive.r6DesingPatterns.structual.decorator;

public class Client {

    public static void main(String[] args) {

        Burger burger = new PlainBurger();
//        burger.makeBurger();

        new CheeseBurgerDecorator(burger).makeBurger();

        new BarbecueBurgerDecorator(burger).makeBurger();
    }
}
