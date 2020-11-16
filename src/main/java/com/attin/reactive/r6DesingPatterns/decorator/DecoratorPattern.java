package com.attin.reactive.r6DesingPatterns.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {

//        Burger myOrder = new BurgerShop(new Function<Burger, Burger>() {
//            @Override
//            public Burger apply(Burger burger) {
//                return burger.addVegies();
//            }
//        }).use(new Burger());

        Burger myOrder = new BurgerShop(burger -> burger.addVegies()).use( new BurgerShop(burger -> burger.addVegies()).use(new Burger()));
        System.out.println("I get "+myOrder);


    }
}
