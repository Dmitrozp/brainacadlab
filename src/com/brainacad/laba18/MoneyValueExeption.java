package com.brainacad.laba18;

public class MoneyValueExeption extends RuntimeException {

    public MoneyValueExeption() {
        super("Cумма пеервода не ликвидна");
    }
}
