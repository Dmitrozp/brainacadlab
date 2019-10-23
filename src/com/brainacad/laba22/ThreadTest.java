package com.brainacad.laba22;

public class ThreadTest  {


    public static void main(String[] args) {

        Thread thread2 = new Thread(new RunnableClass2("Поток 2"));
        Thread thread3 = new Thread(new RunnableClass("Поток 3"));


        thread2.start();
        thread2.run();
        thread3.start();
        thread3.run();

        ThreadTest.thread1();
        ThreadTest.thread2();


    }



    public static void thread1(){
        for (int i = 0; i<1000; i++){
            System.out.println("Поток Маин = " + i);

        }
    }

    public static void thread2(){
        for (int i = 0; i<1000; i++){
            System.out.println("Поток Маин = " + i);

        }
    }


}

