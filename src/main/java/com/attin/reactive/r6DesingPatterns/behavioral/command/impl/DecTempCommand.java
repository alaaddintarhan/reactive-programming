package com.attin.reactive.r6DesingPatterns.behavioral.command.impl;


import com.attin.reactive.r6DesingPatterns.behavioral.command.AC;
import com.attin.reactive.r6DesingPatterns.behavioral.command.ICommandAC;

public class DecTempCommand implements ICommandAC {

    AC ac;

    public DecTempCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Decreasing on the AC");
        ac.incTemp();
    }
}
