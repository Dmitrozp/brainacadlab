package com.brainacadlab15.device.phones;

public class SmartPhone extends Mobile {

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
}
