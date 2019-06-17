package com.threadCommunication.join.join_sleep_2;

public class Run {

    public static void main(String[] args) {
        try {
            Thread2 thread2 = new Thread2();
            Thread1 thread1 = new Thread1(thread2);
            thread1.start();

            Thread.sleep(1000);
            Thread3 thread3 = new Thread3(thread2);
            thread3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
