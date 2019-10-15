package com.brainacad.laba15.cookers;

public class Oven extends AbstractCooker{

    public Oven(String name, int serialNumber) {
        super(name, serialNumber);
    }

    void initTimer(int a){
        System.out.println("Ставим таймер на печь" + a);
    }

    @Override
    public void cook(){
        if (super.isStatusOn() == true) {
            System.out.println("готовим еду в печи ");
            return;
        }
        System.out.println("Печь не включена!!! Включите печь ");
    }

    @Override
    public void powerOn(){
        super.setStatusOn(true);
        System.out.println("Включаем печь");
    }
    @Override
    public void powerOff(){
        super.setStatusOn(false);
        System.out.println("Выключаем печь ");
    }
}
