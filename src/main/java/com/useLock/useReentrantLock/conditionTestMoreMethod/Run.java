package com.useLock.useReentrantLock.conditionTestMoreMethod;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        Thread1 thread1 = new Thread1(myService);
        thread1.setName("a");
        thread1.start();

        Thread2 thread2 = new Thread2(myService);
        thread2.setName("b");
        thread2.start();

        Thread.sleep(100);

        Thread3 thread3 = new Thread3(myService);
        thread3.setName("c");
        thread3.start();

        Thread4 thread4 = new Thread4(myService);
        thread4.setName("d");
        thread4.start();
    }
}
