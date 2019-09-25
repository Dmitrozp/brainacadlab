package com.brainacadlab15.device.phones;

public class Mobile extends Phone {

    private int simCount;
    private boolean display;

    public Mobile(String name, int serialNumber, int simCount) {
        super(name, serialNumber);
        this.simCount = simCount;
    }

    @Override
    public void powerOn() {
        this.display = true;
        System.out.println("Включаем мобильный телефон");

    }

    @Override
    public void powerOff() {
        this.display = false;
        System.out.println("Выключаем мобильный телефон");
    }

    @Override
    public void call(){
        System.out.println("Делаем звонок с мобильного телефона");
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public boolean isdisplay() {
        return display;
    }

}
