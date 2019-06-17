package com.useLock.useReentrantLock.awaitUninterruptiblyTest_1;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        Thread1 thread1=new Thread1(service);
        thread1.start();
        Thread.sleep(3000);
        thread1.interrupt();
    }
}
