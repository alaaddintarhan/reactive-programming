package com.attin.reactive.r6DesingPatterns.behavioral.command.impl;


import com.attin.reactive.r6DesingPatterns.behavioral.command.ICommandAC;

public class ACAutomationRemote {

    private  ICommandAC command;

    public void setCommand(ICommandAC command) {
        this.command = command;
    }

    public void buttonPressed() {
          command.execute();
    }
}
