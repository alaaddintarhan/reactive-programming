package com.attin.reactive.r7DesingPatterns.builder;


import java.util.function.Consumer;

public class MobileBuilder {
    int store;
    int ram, builder;
    int battery;
    int camera;
    String processor;
    double screenSize;

    private  Consumer<MobileBuilder> x;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }

}
