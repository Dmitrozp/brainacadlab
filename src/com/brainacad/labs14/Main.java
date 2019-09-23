package com.brainacad.labs14;

import com.brainacad.labs14.people.client.Client;
import com.brainacad.labs14.position.Cashier;
import com.brainacad.labs14.position.Manager;
import com.brainacad.labs14.position.Security;
import com.brainacad.labs14.shops.Shop;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.Shop("Магазин № 1", "ул. Победы 133");
        Client client = new Client();

        shop.manager = new Manager();
        shop.cashier = new Cashier();
        shop.security = new Security();

        shop.manager.Employee("Степанов Федор", "22/02/1985", "12/02/2020", 1500);
        shop.cashier.Employee("Еремова Анна", "12/03/1954", "01/02/2019", 2500);
        shop.security.Employee("Степанов Саша", "29/02/1977", "12/12/2018", 1100);

        shop.openShop();
        shop.security.goToWork();
        shop.cashier.goToWork();
        shop.manager.goToWork();

        client.infoGoods();
        shop.manager.toAdvise();
        client.bay();
        shop.cashier.working();
        shop.security.working();

        shop.goToLunch();

        System.out.println("\n----------Персонал магазина-----------");
        shop.manager.setDepartment("Департамент продаж");
        shop.manager.showInfo();
        shop.security.showInfo();
        shop.cashier.setNumberCashDesk(12);
        shop.cashier.showInfo();

        System.out.println("\n----------------------------------------------");
        System.out.println("hashCOde cashier = " + shop.cashier.hashCode());
        System.out.println("hashCOde manager = " + shop.manager.hashCode());
        System.out.println("hashCOde security = " + shop.security.hashCode());

        System.out.println(shop.security.toString());
        System.out.println(shop.manager.toString());
        System.out.println(shop.cashier.toString());
}
}
