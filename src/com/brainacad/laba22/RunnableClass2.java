package com.brainacad.laba22;

public class RunnableClass2 implements Runnable {

    private String localName;


    public RunnableClass2(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
        for (int i = 0; i<50; i++){
            System.out.println( localName + "= " + i);
            try {
                Thread.sleep((long)(Math.random()*10000/(i+1)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
