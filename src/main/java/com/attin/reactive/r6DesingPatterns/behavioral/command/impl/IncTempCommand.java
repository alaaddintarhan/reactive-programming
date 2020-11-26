package com.attin.reactive.r6DesingPatterns.behavioral.command.impl;

import com.attin.reactive.r6DesingPatterns.behavioral.command.AC;
import com.attin.reactive.r6DesingPatterns.behavioral.command.ICommandAC;

public class IncTempCommand implements ICommandAC {

    AC ac;
    public IncTempCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Increasing on the AC");
        ac.incTemp();
    }
}
