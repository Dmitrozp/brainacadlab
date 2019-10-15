package com.brainacad.laba20;

public class XmlData extends AbstractData  implements Storable {

    private final Type type = Type.XML;
    private String data;

    public XmlData(long id) {
        super(id);
    }

    @Override
    public String convertToString() {
        return "XmlData{" +
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
    public String toString() {
        return "XmlData{" +
                "data='" + data + '\'' +
                '}';
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
}
