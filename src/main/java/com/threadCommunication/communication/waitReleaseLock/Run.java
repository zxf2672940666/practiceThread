package com.threadCommunication.communication.waitReleaseLock;

public class Run {

    public static void main(String[] args) {
        Object lock=new Object();
        Thread1 thread1=new Thread1(lock);
        thread1.start();

        Thread2 thread2=new Thread2(lock);
        thread2.start();
    }
}
