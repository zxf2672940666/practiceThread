package com.useLock.useReentrantLock.useConditionWaitNotifyError;

public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread1 thread1 = new Thread1(myService);
        thread1.start();
    }
}
