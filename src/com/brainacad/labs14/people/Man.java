package com.brainacad.labs14.people;

import java.util.Objects;

public abstract class Man {

    private String firstSecondName;
    private String dateOfBirth;
    private int phoneNumber;


    public Man(String firstSecondName, String dateOfBirth){
        this.firstSecondName = firstSecondName;
        this.dateOfBirth = dateOfBirth;
    }

    public void showInfo(){
        System.out.println("--------------------------------------" +
                            "\nФамилия Имя: " + firstSecondName +
                            "\nДата рождения: " + dateOfBirth +
                            "\nНомер телефона: " + phoneNumber);
    }

    public void sayHello(){
        System.out.println("");
    }

    public void sayBay(){
        System.out.println("");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return phoneNumber == man.phoneNumber &&
                firstSecondName.equals(man.firstSecondName) &&
                dateOfBirth.equals(man.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSecondName, dateOfBirth, phoneNumber);
    }

    @Override
    public String toString() {
        return "Man{" +
                "firstSecondName='" + firstSecondName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
