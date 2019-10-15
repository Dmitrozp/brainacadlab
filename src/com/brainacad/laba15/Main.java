package com.brainacad.laba15;

import com.brainacad.laba15.phones.DialPhone;
import com.brainacad.laba15.phones.Mobile;
import com.brainacad.laba15.phones.SmartPhone;
import com.brainacad.laba15.cookers.Multicooker;
import com.brainacad.laba15.cookers.Oven;
import com.brainacad.laba15.interfaces.EmailSender;

public class Main {
    public static void main(String[] args) {

        SmartPhone lg = new SmartPhone("Андройд", 23472389, 345345, "Андройд");
        DialPhone philips = new DialPhone("кнопочный", 7856456);
        Mobile nokia3310 = new Mobile("Нокиа", 45663453, 656);
        Oven oven = new Oven("Печка аристон", 38457238);
        Multicooker multicooker = new Multicooker("Скороварка", 9038409);


        lg.powerOn();
        lg.runApp("Опера");
        lg.powerOff();

        philips.powerOn();
        philips.call();
        philips.ishasAnswerphone();
        philips.powerOff();

        nokia3310.powerOn();
        nokia3310.call();
        nokia3310.powerOff();

        oven.powerOn();
        oven.cook();
        oven.powerOff();
        oven.setStatusOn(false);
        oven.cook();

        multicooker.powerOn();
        multicooker.cook();
        multicooker.powerOff();
        multicooker.setStatusOn(false);
        multicooker.cook();

        System.out.println("----------------------------------");
        allDeviceOn(lg, nokia3310, philips);
        System.out.println("----------------------------------");
        allSender("mail@gmail.com", nokia3310, lg);

    }


    static void allDeviceOn(AbstractDevice ... abstractdevice){

        for (int i = 0; i<abstractdevice.length; i++) {
            if (abstractdevice[i] != null)
                abstractdevice[i].powerOn();
        }
    }

    static void allSender(String recipient, EmailSender ... emailSenders){

        for(int i=0; i<emailSenders.length; i++){
            emailSenders[i].sendMail(recipient);
        }
    }
        







}
