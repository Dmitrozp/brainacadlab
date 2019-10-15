package com.brainacad.laba20;

public class DocumentProcessorUtil {
    static long ID_COUNTER = 0;

    private DocumentProcessorUtil() {
    }

    public static <T extends AbstractData & Storable>StringData convert(T data) {
        return new StringData(ID_COUNTER++, data);
    }

     public static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);


    }
}
