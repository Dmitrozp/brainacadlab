package com.brainacad.laba20;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        XmlData xmlData = new XmlData(DocumentProcessorUtil.ID_COUNTER);
        BinaryData binaryData = new BinaryData(DocumentProcessorUtil.ID_COUNTER);
        NumericData numericData = new NumericData(DocumentProcessorUtil.ID_COUNTER);

        String xmlDataString = "<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        Double d = 123.456789;
        byte[] massByte = new byte[]{1,2,3,4,5,6};


        DocumentProcessorUtil.build(xmlData, xmlDataString);
        DocumentProcessorUtil.build(numericData, d);
        DocumentProcessorUtil.build(binaryData, massByte );

        StringData s1;
        s1 = DocumentProcessorUtil.convert(xmlData);
        StringData s2;
        s2 = DocumentProcessorUtil.convert(binaryData);
        StringData s3;
        s3 = DocumentProcessorUtil.convert(numericData);


        System.out.println(xmlData.getData());
        System.out.println(binaryData.toString());
        System.out.println(numericData.getData());
        System.out.println(s1.getData());
        System.out.println(s2.getData());
        System.out.println(s3.getData());


    }
}
