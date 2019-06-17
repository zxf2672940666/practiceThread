package com.useLock.useReentrantLock.ReentrantLockTest;

public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread1 thread1 = new Thread1(myService);
        Thread1 thread2 = new Thread1(myService);
        Thread1 thread3 = new Thread1(myService);
        Thread1 thread4 = new Thread1(myService);
        Thread1 thread5 = new Thread1(myService);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
