package com.attin.reactive.r7DesingPatterns.decorator;

public class Burger {

    private String burgerType;

    public Burger() {
        this.burgerType = "";
    }

    public Burger(String bugerType) {
        this.burgerType = bugerType;
    }

    public Burger addVegies() {
        System.out.println("Adding vegies to the burger...");
        return  new Burger(this.burgerType +=" Vegie");
    }

    public Burger addCheese() {
        System.out.println("Adding cheese to the burger...");
        return  new Burger(this.burgerType +=" Cheese");
    }

    @Override
    public String toString() {
        return String.format("BurgerType : %s", burgerType);
    }
}
