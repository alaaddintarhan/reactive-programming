package com.attin.reactive.r6DesingPatterns.behavioral.commond.impl;

import com.attin.reactive.r6DesingPatterns.behavioral.commond.AC;
import com.attin.reactive.r6DesingPatterns.behavioral.commond.ICommandAC;

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
