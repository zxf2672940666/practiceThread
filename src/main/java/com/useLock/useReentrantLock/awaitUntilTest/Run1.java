package com.useLock.useReentrantLock.awaitUntilTest;

public class Run1 {

    public static void main(String[] args) {
        Service service=new Service();
        Thread1 thread1=new Thread1(service);
        thread1.start();
    }
}
