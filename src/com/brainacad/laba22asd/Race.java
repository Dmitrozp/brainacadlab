package com.brainacad.laba22asd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Race {

    public static long startRaceTime;
    RaceCarRunnable winner;

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(4);




        List<RaceCarRunnable> cars = new ArrayList<>();

        cars.add(0,new RaceCarRunnable("Honda", 123, 300));
        cars.add(1,new RaceCarRunnable("Lada", 90, 300));
        cars.add(2,new RaceCarRunnable("Nissan", 200, 300));
        cars.add(3,new RaceCarRunnable("Ford", 250, 300));

        List<Thread> threads = new ArrayList<>(10);

        threads.add(0, new Thread(cars.get(0)));
        threads.add(1, new Thread(cars.get(1)));
        threads.add(2, new Thread(cars.get(2)));
        threads.add(3, new Thread(cars.get(3)));

        Race.startRace(threads);
        countDownLatch.await();

        System.out.println("Winner " + cars.get(Race.winner(cars)).getName()
                                    + "Time " + cars.get(Race.winner(cars)).getFinishTime());





    }

    public static void startRace(List<Thread> cars){

        Thread thread = new Thread( (new Runnable() {
            @Override
            public void run() {
                System.out.println("запуск отсчета");

                for (int i = 5; i != 0; i--) {
                    try {
                        System.out.println( i);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("GO!!!");

                    for(int i=0; i<=3; i++){
                        System.out.println("Запус потока " + i);
                        cars.get(i).start();

                }
            }

        }));

        thread.start();

    }

    public static int winner(List<RaceCarRunnable> cars){
        long winnerTime = cars.get(0).getFinishTime();
        int numberWinner = 0;

        for(int i=0; i<cars.size(); i++){
            if(winnerTime < cars.get(i).getFinishTime()){
                winnerTime = cars.get(i).getFinishTime();
                numberWinner = i;
            }
        }

        return numberWinner;
    }

}

