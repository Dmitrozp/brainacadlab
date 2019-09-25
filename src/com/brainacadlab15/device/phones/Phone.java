package com.brainacadlab15.device.phones;

import com.brainacadlab15.device.AbstractDevice;

abstract class Phone extends AbstractDevice {

    public Phone(String name, int serialNumber) {
        super(name, serialNumber);
    }

    abstract void call();
}
