package com.brainacadlab15.device;

import com.brainacadlab15.device.cookers.Multicooker;
import com.brainacadlab15.device.cookers.Oven;
import com.brainacadlab15.device.phones.DialPhone;
import com.brainacadlab15.device.phones.Mobile;
import com.brainacadlab15.device.phones.SmartPhone;

public class Main {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Андройд", 23472389, 345345, "Андройд");
        DialPhone dialPhone = new DialPhone("кнопочный", 7856456);
        Mobile mobile = new Mobile("Нокиа", 45663453, 656);
        Oven oven = new Oven("Печка аристон", 38457238);
        Multicooker multicooker = new Multicooker("Скороварка", 9038409);


        smartPhone.powerOn();
        smartPhone.runApp("Опера");
        smartPhone.powerOff();

        dialPhone.powerOn();
        dialPhone.call();
        dialPhone.ishasAnswerphone();
        dialPhone.powerOff();

        mobile.powerOn();
        mobile.call();
        mobile.powerOff();

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
    }


        public static void allDeviceOn(AbstractDevice ... abstractdevice){
            if  (abstractdevice != null){
        abstractdevice[].powerOn();
        breake;
        }

        public static void mailSender(){


   }
}
