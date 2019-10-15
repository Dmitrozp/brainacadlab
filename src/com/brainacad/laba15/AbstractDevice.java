package com.brainacad.laba15;

public abstract class AbstractDevice {

    private final String name;
    private final int serialNumber;

    public AbstractDevice(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public abstract void powerOn();
    public abstract void powerOff();

    public String getName() {
        return name;
    }

}
