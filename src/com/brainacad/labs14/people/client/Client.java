package com.brainacad.labs14.people.client;

import com.brainacad.labs14.people.Human;

import java.util.Objects;

public class Client extends Human {

    private int discountCard;
    private double amountOfMoney;


    public void infoGoods(){
        System.out.println("Клиент получает консультацию");
    }

    public void bay(){
        System.out.println("Клиент покупает товар");
    }

    public Client(String firstSecondName, String dateOfBirth, int discountCard) {
        super(firstSecondName, dateOfBirth);
        this.discountCard = discountCard;
    }

    public void Client(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return discountCard == client.discountCard &&
                Double.compare(client.amountOfMoney, amountOfMoney) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountCard, amountOfMoney);
    }

    @Override
    public String toString() {
        return "Client{" +
                "discountCard=" + discountCard +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
