package com.brainacad.laba20;

public class NumericData extends AbstractData implements Storable {

    private final Type type = Type.NUM;
    private Number data;

    public NumericData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return "NumericData{" +
                "data=" + data +
                '}';
    }

    public Number getData() {
        return data;
    }

    public void setData(Number data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NumericData{" +
                "data=" + data +
                '}';
    }

    @Override
    public Object read() {
        return null;
    }

    @Override
    public void write(Object data) {
        this.data = (Number) data;
    }

    @Override
    public Type getType() {
        return null;
    }
}
