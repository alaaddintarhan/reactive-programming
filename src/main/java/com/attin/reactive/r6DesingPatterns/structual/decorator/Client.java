package com.attin.reactive.r6DesingPatterns.structual.decorator;

import com.attin.reactive.r10DesignPatterns.structual.decorator.BarbecueBurgerDecorator;
import com.attin.reactive.r10DesignPatterns.structual.decorator.Burger;
import com.attin.reactive.r10DesignPatterns.structual.decorator.CheeseBurgerDecorator;
import com.attin.reactive.r10DesignPatterns.structual.decorator.PlainBurger;

public class Client {

    public static void main(String[] args) {

        Burger burger = new PlainBurger();
//        burger.makeBurger();

        new CheeseBurgerDecorator(burger).makeBurger();

        new BarbecueBurgerDecorator(burger).makeBurger();
    }
}
