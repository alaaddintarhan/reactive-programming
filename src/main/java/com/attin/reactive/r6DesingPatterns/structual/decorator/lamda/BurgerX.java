package com.attin.reactive.r6DesingPatterns.structual.decorator.lamda;

public class BurgerX {

    private String burgerType;

    public BurgerX() {
        this.burgerType = "";
    }

    public BurgerX(String bugerType) {
        this.burgerType = bugerType;
    }

    public BurgerX addVegies() {
        System.out.println("Adding vegies to the burger...");
        return  new BurgerX(this.burgerType +=" Vegie");
    }

    public BurgerX addCheese() {
        System.out.println("Adding cheese to the burger...");
        return  new BurgerX(this.burgerType +=" Cheese");
    }

    @Override
    public String toString() {
        return String.format("BurgerType : %s", burgerType);
    }
}
