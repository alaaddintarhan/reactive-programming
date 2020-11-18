package com.attin.reactive.r6DesingPatterns.creational.builder.lamda.mobileX;

public class MobileX {

    final int ram, store;
    final int battery;
    final int camera;
    final String processor;
    final double screenSize;

    public MobileX(MobileXBuilder builder) {
        this.ram = builder.ram;
        this.store = builder.store;
        this.battery = builder.battery;
        this.camera = builder.camera;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStore() {
        return store;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", store=" + store +
                ", battery=" + battery +
                ", camera=" + camera +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
