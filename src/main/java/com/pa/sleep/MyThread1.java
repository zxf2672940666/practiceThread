package com.pa.sleep;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("threadName="+this.currentThread().getName()+" begin");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("threadName="+this.currentThread().getName()+" end");
    }
}
