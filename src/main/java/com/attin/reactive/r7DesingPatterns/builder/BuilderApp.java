package com.attin.reactive.r7DesingPatterns.builder;

public class BuilderApp {

    public static void main(String[] args) {

        MobileBuilder builder = new MobileBuilder();
        Mobile mobile = builder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.battery = 4000;
            myBuilder.processor = "A12 Bionic";
            myBuilder.ram = 4;
        }).createMobile();

        System.out.println(mobile);
    }
}
