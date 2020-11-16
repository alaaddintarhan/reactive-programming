package com.attin.reactive.r6DesingPatterns.command;

public class ACAutomationRemote {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPress() {
        command.execute();
    }
}
