package com.attin.reactive.r6DesingPatterns.creational.builder.lamda.mobileX;

public class MobileXBuilderApp {

    public static void main(String[] args) {

        MobileXBuilder builder = new MobileXBuilder();
        MobileX mobile = builder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.battery = 4000;
            myBuilder.processor = "A12 Bionic";
            myBuilder.ram = 4;
        }).createMobile();

        System.out.println(mobile);
    }
}
