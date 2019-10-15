package com.brainacad.laba15.cookers;

import com.brainacad.laba15.AbstractDevice;

abstract class AbstractCooker extends AbstractDevice {

    private boolean statusOn;

    public AbstractCooker(String name, int serialNumber) {
        super(name, serialNumber);
    }

    abstract void cook();

    public boolean isStatusOn() {
        return statusOn;
    }

    public void setStatusOn(boolean statusOn){
        this.statusOn = statusOn;
    }
}
