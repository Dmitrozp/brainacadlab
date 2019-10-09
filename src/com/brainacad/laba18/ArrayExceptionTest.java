package com.brainacad.laba18;

public class ArrayExceptionTest  {

    int indexMass = 0;

    public static void main(String[] args) {

        ArrayExceptionTest test = new ArrayExceptionTest();

        int [] mass = new int[] {1,2,3,4,5,6,7,8};


        try {
            //test.printArray(mass, 2, 7);
            ArrayExceptionTest.printArray2(mass, 2,9);
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


    public static int printArray2(int[] mass, int start, int end) throws RuntimeException{

        int indexMass = 0;

        for(int i = start; i< end; i++){
            System.out.println(mass[i]);
            indexMass = i;
        }
        return indexMass;
    }
}
