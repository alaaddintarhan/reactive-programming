package com.attin.reactive.r6DesingPatterns.behavioral.commond;

import com.attin.reactive.r6DesingPatterns.behavioral.commond.impl.ACAutomationRemote;

public class CommandDesignPatternLamda {

    public static void main(String[] args) {
        AC ac1 = new AC();
        AC ac2 = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();

        remote.setCommand(() -> ac2.turnOn());

        remote.buttonPressed();
    }
}
