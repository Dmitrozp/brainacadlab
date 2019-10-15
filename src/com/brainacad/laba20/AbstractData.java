package com.brainacad.laba20;

public abstract class AbstractData {

    private long id;

    public AbstractData(long id) {
        this.id = id;
    }

    abstract String convertToString();

    public long getId() {
        return id;
    }
}
