package com.brainacad.labs14.position;

import com.brainacad.labs14.people.personal.Employee;
import java.util.Objects;

public class Cashier extends Employee {

    private int numberCashDesk;

    public void checkTheMoney(){};
    public int getNumberCashDesk() {
        return numberCashDesk;
    }
    public void setNumberCashDesk(int numberCashDesk) {
        this.numberCashDesk = numberCashDesk;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Номер кассы: " + numberCashDesk );
    }

    @Override
    public void goToLunch(){
        System.out.println("Кассир пошел на обед");
    }

    @Override
    public void working(){
        super.working();
        System.out.println("Кассир делает свою работу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cashier cashier = (Cashier) o;
        return numberCashDesk == cashier.numberCashDesk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberCashDesk);
    }

    @Override
    public String toString() {
        super.toString();
        return "Cashier{" +
                "numberCashDesk=" + numberCashDesk +
                '}';
    }
}
