package com.attin.reactive.r05NullPointer.model;

import java.util.Optional;

public class Computer {

    private Optional<Soundcard> soundcard;

    public Optional<Soundcard> getSoundcard() {
        return soundcard;
    }

    public void setSoundcard(Optional<Soundcard> soundcard) {
        this.soundcard = soundcard;
    }
}
