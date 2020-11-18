package com.attin.reactive.r6DesingPatterns.structual.decorator.lamda;

public class BurderXDecorator {

    public static void main(String[] args) {

//        Burger myOrder = new BurgerShop(new Function<Burger, Burger>() {
//            @Override
//            public Burger apply(Burger burger) {
//                return burger.addVegies();
//            }
//        }).use(new Burger());

        BurgerX myOrder = new BurgerXShop(burger -> burger.addVegies()).use( new BurgerXShop(burger -> burger.addVegies()).use(new BurgerX()));
        System.out.println("I get "+myOrder);


    }
}
