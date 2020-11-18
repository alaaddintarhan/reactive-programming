package com.attin.reactive.r6DesingPatterns.creational.builder.lamda.mobileX;


import java.util.function.Consumer;

public class MobileXBuilder {
    int store;
    int ram, builder;
    int battery;
    int camera;
    String processor;
    double screenSize;

    private  Consumer<MobileXBuilder> x;

    public MobileXBuilder with(Consumer<MobileXBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public MobileX createMobile() {
        return new MobileX(this);
    }

}
