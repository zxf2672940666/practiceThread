package com.useLock.useReentrantLock.useConditionWaitNotifyOK;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        Thread1 thread1 = new Thread1(myService);
        thread1.start();
        Thread.sleep(3000);
        myService.signal();
    }
}
