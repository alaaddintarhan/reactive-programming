package com.attin.reactive.r6DesingPatterns.behavioral.commond.impl;

import com.attin.reactive.r10DesignPatterns.behavioral.commond.AC;
import com.attin.reactive.r10DesignPatterns.behavioral.commond.ICommandAC;

public class DecTempCommand implements ICommandAC {

    com.attin.reactive.r10DesignPatterns.behavioral.commond.AC ac;
    public DecTempCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Decreasing on the AC");
        ac.incTemp();
    }
}
