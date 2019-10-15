package com.brainacad.laba15.phones;

import com.brainacad.laba15.AbstractDevice;

abstract class Phone extends AbstractDevice {

    public Phone(String name, int serialNumber) {
        super(name, serialNumber);
    }

    abstract void call();
}
