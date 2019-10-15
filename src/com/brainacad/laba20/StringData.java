package com.brainacad.laba20;

public class StringData extends AbstractData implements Storable {

    private final Type type = Type.XML;
    private String data;

    public <T extends AbstractData & Storable>StringData(long id, T data) {
        super(id);
        this.data = data.toString();
    }

    @Override
    public String toString() {
        return "StringData{" +
                "data='" + data + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public Object read() {
        return null;
    }

    @Override
    public void write(Object data) {
        this.data = (String) data;

    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    String convertToString() {
        return "XmlData{" +
                "data='" + data + '\'' +
                '}';
    }
}
