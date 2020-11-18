package com.attin.reactive.r6DesingPatterns.behavioral.commond;


import com.attin.reactive.r6DesingPatterns.behavioral.commond.impl.ACAutomationRemote;
import com.attin.reactive.r6DesingPatterns.behavioral.commond.impl.IncTempCommand;
import com.attin.reactive.r6DesingPatterns.behavioral.commond.impl.StartACCommand;

public class CommandDesignPattern {

    public static void main(String[] args) {

        AC acRoomOne = new AC();
        AC acRoomTwo = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();

        remote.setCommand(new StartACCommand(acRoomOne));
        remote.buttonPressed();

        remote.setCommand(new StartACCommand(acRoomTwo));
        remote.buttonPressed();

        remote.setCommand(new IncTempCommand(acRoomOne));
        remote.buttonPressed();


    }
}
