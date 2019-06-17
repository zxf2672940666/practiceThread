package com.threadCommunication.join.s5;

public class Run {

    public static void main(String[] args) {
        try {
            Thread1 thread1 = new Thread1();
            thread1.start();
            Thread.sleep(1000);
            Thread2 thread2 = new Thread2();
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
