package com.threadCommunication.communication.waitInterruptException;

public class Run {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            Thread1 thread1 = new Thread1(lock);
            thread1.start();
            Thread.sleep(5000);
            thread1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
