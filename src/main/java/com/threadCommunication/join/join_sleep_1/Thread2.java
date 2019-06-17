package com.threadCommunication.join.join_sleep_1;

public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(" b run gein time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b  run end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void bService() {
        System.out.println("打印bService time=" + System.currentTimeMillis());
    }
}
