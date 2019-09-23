package com.brainacad.labs14.people.personal;

import com.brainacad.labs14.people.Man;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Man {

    private String dateOfRecruitment;
    private int wages;
    private boolean presentAtWork;

    public void goToWork(){}
    public void goToLunch(){}
    public void working(){}

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Дата прийома на работу: " + dateOfRecruitment +
                            "\nЗарплата:" + wages);
    }

    public void Employee(String firstSecondName, String dateOfBirth, String dateOfRecruitment, int wages){
        super.Man(firstSecondName,dateOfBirth);
        this.dateOfRecruitment = dateOfRecruitment;
        this.wages = wages;
    }

    public void Employee(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return wages == employee.wages &&
                presentAtWork == employee.presentAtWork &&
                dateOfRecruitment.equals(employee.dateOfRecruitment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfRecruitment, wages, presentAtWork);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Employee{" +
                "dateOfRecruitment='" + dateOfRecruitment + '\'' +
                ", wages=" + wages +
                ", presentAtWork=" + presentAtWork +
                '}';
    }

}
