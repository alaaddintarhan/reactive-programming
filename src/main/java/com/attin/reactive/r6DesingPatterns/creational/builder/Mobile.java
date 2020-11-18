package com.attin.reactive.r6DesingPatterns.creational.builder;

public class Mobile {

    private String memory;
    private String battery;
    private String wireless;
    private String screen;
    private String matalCase;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMatalCase() {
        return matalCase;
    }

    public void setMatalCase(String matalCase) {
        this.matalCase = matalCase;
    }
}
