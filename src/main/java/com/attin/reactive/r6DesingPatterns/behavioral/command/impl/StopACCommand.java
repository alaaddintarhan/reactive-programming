package com.attin.reactive.r6DesingPatterns.behavioral.command.impl;


import com.attin.reactive.r6DesingPatterns.behavioral.command.AC;
import com.attin.reactive.r6DesingPatterns.behavioral.command.ICommandAC;

public class StopACCommand implements ICommandAC {

    AC ac;
    public StopACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning off the AC");
        ac.turnOn();
    }
}
