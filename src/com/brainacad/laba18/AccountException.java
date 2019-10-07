package com.brainacad.laba18;

public class AccountException extends RuntimeException {

    public AccountException() {
        super("Номера карт одинаковые");
    }
}
