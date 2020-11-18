package com.attin.reactive.r6DesingPatterns.creational.builder;

//Director
public class Manufacturer {

    public static Mobile createCompletedObject() {

        MobileBuilder builder = new MobileConcreteBuilder();

        return builder.buildMobile();
    }
}
