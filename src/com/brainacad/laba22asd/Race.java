package com.brainacad.laba22asd;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race {

    private static long startRaceTime;
    private RaceCarRunnable winner;
    public final static CountDownLatch countDownLatch = new CountDownLatch(4);


    public static void main(String[] args) throws InterruptedException {

        List<RaceCarRunnable> cars = new ArrayList<>();

        cars.add(new RaceCarRunnable("Honda", 123, 300));
        cars.add(new RaceCarRunnable("Lada", 90, 300));
        cars.add(new RaceCarRunnable("Nissan", 200, 300));
        cars.add(new RaceCarRunnable("Ford", 250, 300));

        List<Thread> threads = new ArrayList<>(10);

        cars.forEach(c -> threads.add(new Thread(c)));

        Race.startRace(threads);
        Race.countDownLatch.await();

        System.out.println("\nWinner " + cars.get(Race.winner(cars)).getName()
                                    + " Time " + Race.convertToTime(cars.get(Race.winner(cars))
                                                                    .getFinishTime()));





    }

    public static void startRace(List<Thread> cars){

        Thread thread = new Thread( (() -> {
            System.out.println("запуск отсчета");

            for (int i = 5; i != 0; i--) {
                try {
                    System.out.println( i);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            startRaceTime = System.currentTimeMillis();
            System.out.println("GO!!! Start Time = " + Race.convertToTime(startRaceTime)  + "sec");


                for(int i=0; i<=3; i++){
                    System.out.println("Запус потока " + i);
                    cars.get(i).start();

            }
        }));

        thread.start();

    }

    public static int winner(List<RaceCarRunnable> cars){
        long winnerTime = cars.get(0).getFinishTime();
        int numberWinner = 0;

        for(int i=0; i<cars.size(); i++){
            if(winnerTime > cars.get(i).getFinishTime()){
                winnerTime = cars.get(i).getFinishTime();
                numberWinner = i;
            }
        }

        return numberWinner;
    }

    public static String convertToTime(long time){
        return String.format("%02d:%02d:%02d", time / 1000 / 3600, time / 1000 / 60 % 60, time / 1000 % 60);
    }

}

