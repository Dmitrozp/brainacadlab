package com.brainacad.laba20;

import java.util.Arrays;

public class BinaryData extends AbstractData  implements Storable {

    private final Type type = Type.BIN;
    private byte[] data;

    public BinaryData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return "BinaryData{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    public String toString() {
        return "BinaryData{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public Object read() {
        return null;
    }

    @Override
    public void write(Object data) {
        this.data = (byte[])data;

    }

    @Override
    public Type getType() {
        return null;
    }
}
