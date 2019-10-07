package com.brainacad.laba18;

public class ArrayExceptionTest  {

    int indexMass = 0;

    public static void main(String[] args) {

        ArrayExceptionTest test = new ArrayExceptionTest();

        int [] mass = new int[] {1,2,3,4,5,6};


        try {
            test.printArray(mass, 2, 7);
        }
        catch (RuntimeException e){
            System.out.println("«Ошибка. Попытка обращения к"
                    + test.indexMass + "несуществующему индексу: текущий индекс = "
                    + test.indexMass +" размер массива = " + mass.length);
        }


    }

    public void printArray(int[] mass, int start, int end) throws RuntimeException{

        for(int i = start; i< end; i++){
            this.indexMass = i;
            System.out.println(mass[i]);
        }
    }
}
