package com.brainacad.laba22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ThreadTest implements Predicate {



    public static void main(String[] args) throws InterruptedException {

        List<String> list = new ArrayList<>(Arrays.asList("asd", "sdfsd", "fsfs", "12312", "fsdf9");

        String asd = "asd";

        long as = list.stream().filter(asd::equals).count();


        Thread thread2 = new Thread(new RunnableClass2("Поток-2"));
        Thread thread3 = new Thread(new RunnableClass("Поток---3"));


thread2.start();
thread3.start();

    }




    public static void thread1() throws InterruptedException {
        for (int i = 0; i<1000; i++){
            Thread.sleep(450);
            System.out.println("Поток Маин = " + i);

        }
    }

    public static void thread2(){
        for (int i = 0; i<1000; i++){
            System.out.println("Поток Маин = " + i);

        }
    }


    @Override
    public boolean test(Object o) {
        return false;
    }
}

