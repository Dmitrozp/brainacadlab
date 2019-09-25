package com.brainacad.labs14.shops;

import com.brainacad.labs14.people.client.Client;
import com.brainacad.labs14.position.Cashier;
import com.brainacad.labs14.position.Manager;
import com.brainacad.labs14.position.Security;

import java.util.Objects;

public class Shop {

    private String name;
    private String address;
    public Manager manager;
    public Cashier cashier;
    public Client client;
    public Security security;

    public void openShop(){
        System.out.println("----Магазин открылся----");
    }

    public void goToLunch(){

        System.out.println("----Магазин закрылся на обед----");
        manager.goToLunch();
        cashier.goToLunch();
        security.goToLunch();

    }

    public void sellGoods(){};

    public void Shop(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void Shop(){}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return name.equals(shop.name) &&
                address.equals(shop.address) &&
                Objects.equals(manager, shop.manager) &&
                Objects.equals(cashier, shop.cashier) &&
                Objects.equals(client, shop.client) &&
                Objects.equals(security, shop.security);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, manager, cashier, client, security);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", adress='" + address + '\'' +
                ", manager=" + manager +
                ", cashier=" + cashier +
                ", client=" + client +
                ", security=" + security +
                '}';
    }

}
