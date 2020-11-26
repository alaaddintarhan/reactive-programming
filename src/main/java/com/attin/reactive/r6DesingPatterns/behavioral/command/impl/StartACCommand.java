package com.attin.reactive.r6DesingPatterns.behavioral.command.impl;


import com.attin.reactive.r6DesingPatterns.behavioral.command.AC;
import com.attin.reactive.r6DesingPatterns.behavioral.command.ICommandAC;

public class StartACCommand implements ICommandAC {

   AC ac;

    public StartACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning on the AC");
        ac.turnOn();
    }
}
