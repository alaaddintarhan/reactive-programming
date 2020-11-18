package com.attin.reactive.r6DesingPatterns.behavioral.commond.impl;

import com.attin.reactive.r10DesignPatterns.behavioral.commond.AC;
import com.attin.reactive.r10DesignPatterns.behavioral.commond.ICommandAC;

public class StopACCommand implements ICommandAC {

    com.attin.reactive.r10DesignPatterns.behavioral.commond.AC ac;

    public StopACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning off the AC");
        ac.turnOn();
    }
}
