package com.attin.reactive.r6DesingPatterns.behavioral.command;

import com.attin.reactive.r6DesingPatterns.behavioral.command.impl.ACAutomationRemote;

public class CommandDesignPatternLamda {

    public static void main(String[] args) {
        AC ac1 = new AC();
        AC ac2 = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();

        remote.setCommand(() -> ac2.turnOn());

        remote.buttonPressed();
    }
}
