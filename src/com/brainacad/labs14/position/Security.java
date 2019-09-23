package com.brainacad.labs14.position;

import com.brainacad.labs14.people.personal.Employee;

public class Security extends Employee {

    private String department;

    @Override
    public String toString() {
        super.toString();
        return "Security{" +
                "department='" + department + '\'' +
                '}';
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Департамент: " + department );
    }

    public void talkOnTheRadio(){};

    @Override
    public void working(){
        super.working();
        System.out.println("\nОхранник делает свою работу");
        System.out.println("---------------------------------------------"  );
    }

    @Override
    public void goToLunch(){
        System.out.println("Охранник пошел на обед");
    }
}
