package com.attin.reactive.r6DesingPatterns.behavioral.command;

public class AC {

    public void turnOn(){
        System.out.println( "AC is on.");
    }
    public void turnOff(){
        System.out.println( "AC is off.");
    }
    public void decTemp(){
        System.out.println( "Decreasing temprature by 1.");
    }
    public void incTemp(){
        System.out.println( "Increasing temprature by 1.");
    }
}
