package com.brainacad.laba15.phones;

import com.brainacad.laba15.interfaces.EmailSender;

public class Mobile extends Phone implements EmailSender {

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

    @Override
    public String editMail(String s) {
        return null;
    }

    @Override
    public String createMail(String s) {
        return null;
    }

    @Override
    public void sendMail(String s) {
        System.out.println("Отправка имэила с телефона, через gprs");

    }
}
