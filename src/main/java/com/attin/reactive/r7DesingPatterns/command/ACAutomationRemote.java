package com.attin.reactive.r7DesingPatterns.command;

public class ACAutomationRemote {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPress() {
        command.execute();
    }
}
