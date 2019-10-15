package com.brainacad.laba15.phones;

import com.brainacad.laba15.interfaces.Caller;
import com.brainacad.laba15.interfaces.EmailSender;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

    public SmartPhone(String name, int serialNumber, int simCount, String os) {
        super(name, serialNumber, simCount);
        this.os = os;
    }

    public void runApp(String app){
        if (isdisplay() == true) {
            System.out.println("Запускаем приложение " + app + " на смарфоне ");
        }
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String editMail(String s) {
        System.out.println("Редактировать маил");
        return null;
    }

    @Override
    public String createMail(String s) {
        System.out.println("Создает и-мэил");
        return null;
    }

    @Override
    public void sendMail(String s) {
        System.out.println("Отправка и-маила со смартфона, через 4G");
    }
}
