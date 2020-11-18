package com.attin.reactive.r6DesingPatterns.creational.builder;


public class MobileConcreteBuilder extends MobileBuilder {

    @Override
    public void createMemory() {
        mobile.setMemory("32 GB");
        System.out.println("Memory created and installed");
    }

    @Override
    public void createBattery() {
        mobile.setMemory("4500 mAh");
        System.out.println("Battery created and installed");
    }

    @Override
    public void createWireless() {
        mobile.setMemory("Bluetooth and WiFi");
        System.out.println("Created Wireless feature and installed");
    }

    @Override
    public void createScreen() {
        mobile.setMemory("15 inc");
        System.out.println("Screen created and installed");
    }

    @Override
    public void createMetalCase() {
        mobile.setMemory("Titanium");
        System.out.println("MetalCase created and installed");
    }
}
