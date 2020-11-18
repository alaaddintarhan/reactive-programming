package com.attin.reactive.r6DesingPatterns.behavioral.commond.impl;


import com.attin.reactive.r6DesingPatterns.behavioral.commond.ICommandAC;

public class ACAutomationRemote {

    private  ICommandAC command;

    public void setCommand(ICommandAC command) {
        this.command = command;
    }

    public void buttonPressed() {
          command.execute();
    }
}
