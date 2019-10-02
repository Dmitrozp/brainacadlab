package com.brainacad.laba16;

public class StringTest {

    public static final String[] mounth = new String[12] = {"ЯНВАРЬ", "Февраль", "МАРТ");

    public static void main(String[] args) {

       String liter;
       String str = new String();
       String[] srtarray = new String[];
       byte bytearray[];
       StringBuilder srtbild = new StringBuilder();

        liter = "Апельсин,Яблоко,Гранат,Груша";

        srtarray = liter.split(",");

        for (int i = 0; i<srtarray.length; i++){
            String max = " ";
            if (max.length() < srtarray[i].length()){
                max = srtarray[i];
            }
            System.out.println(max.toLowerCase());
        }









    }

}
