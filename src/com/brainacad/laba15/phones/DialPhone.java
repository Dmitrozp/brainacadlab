package com.brainacad.laba15.phones;

import com.brainacad.laba15.interfaces.Caller;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerphone;

    public DialPhone(String name, int serialNumber) {
        super(name, serialNumber);
    }

    @Override
    public void call() {
        System.out.println("Делаем звонок с телефона ");
    }

    @Override
    public void powerOn() {
        System.out.println("Поднимаем трубку кнопочноготелефона");
    }

    @Override
    public void powerOff() {
        System.out.println("Вешаем трубку кнопочного телефона");
    }

    public void autoAnswer(){
        hasAnswerphone = true;
        System.out.println("Автоответчик на кнопочном телефоне включен");
    }

    public boolean ishasAnswerphone() {
        return hasAnswerphone;
    }
}
