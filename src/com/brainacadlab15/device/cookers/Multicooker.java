package com.brainacadlab15.device.cookers;

import com.brainacadlab15.device.AbstractDevice;

public class Multicooker extends AbstractCooker{

    public Multicooker(String name, int serialNumber) {
        super(name, serialNumber);
    }

    void switchProgram(int a){
        System.out.println("выбор программы номер =" + a);
    }

    @Override
    public void powerOn() {
        super.setStatusOn(true);
        System.out.println("Включаем мультиварку");
    }

    @Override
    public void powerOff() {
        super.setStatusOn(false);
        System.out.println("Выключаем мультиварку");
    }

    @Override
    public void cook(){
        if (super.isStatusOn() == true) {
            System.out.println("Мультиварка готовит еду");
            return;
        }
        System.out.println("Мультиварка не включена!!! Включите мультиварку ");
    }
}
