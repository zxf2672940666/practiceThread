package com.useLock.useReentrantLock.awaitUntilTest;

public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        Thread1 thread1=new Thread1(service);
        thread1.start();

        Thread.sleep(2000);
        Thread2 thread2=new Thread2(service);
        thread2.start();
    }
}
