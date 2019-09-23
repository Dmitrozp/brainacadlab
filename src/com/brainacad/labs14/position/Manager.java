package com.brainacad.labs14.position;

import com.brainacad.labs14.people.personal.Employee;
import java.util.Objects;

public class Manager extends Employee {

    private String department;

    public void toAdvise(){
        System.out.println("Консультант рассказывает о товаре");
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("\nДепартамент: " + department );
        System.out.println("---------------------------------------------"  );
    }

    @Override
    public void goToLunch(){
        System.out.println("Менеджер пошел на обед");
    }

    public void sayAboutSale(){};
    public void toAdvisegoods(){};

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void working(){
        super.working();
        System.out.println("Менеджер делате свою работу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return department.equals(manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        super.toString();
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }

}
