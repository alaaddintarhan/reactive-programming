package com.attin.reactive.r04NullPointer.model;

import java.util.Optional;

public class Soundcard {

    private Optional<USB> usb;

    public Optional<USB> getUsb() {
        return usb;
    }

    public void setUsb(Optional<USB> usb) {
        this.usb = usb;
    }
}
