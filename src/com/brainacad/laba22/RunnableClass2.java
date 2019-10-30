package com.brainacad.laba22;

public class RunnableClass2 implements Runnable {
    private String localName;

    public RunnableClass2() { }
    public RunnableClass2(String localName)
    {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
        for (int i = 0; i<10; i++){
            System.out.println("Поток " + localName + "= " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
