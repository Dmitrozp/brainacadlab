package com.brainacad.laba22;

public class RunnableClass implements Runnable {
    private String localName;
    public RunnableClass() { }


    public RunnableClass(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
        for (int i = 0; i<50;  i++){
            System.out.println( localName + "= " + i);
            if(i==20){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep((long)(Math.random()*10000/(i+1)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
