package com.threadCommunication.join.joinException;


public class Run {

    public static void main(String[] args) {
        try {
            Thread2 thread2 = new Thread2();
            thread2.start();
            Thread.sleep(500);
            Thread3 thread3 = new Thread3(thread2);
            thread3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
