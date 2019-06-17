package com.useLock.useReentrantLock.z3_ok;

public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread1 thread1 = new Thread1(myService);
        thread1.start();
    }
}
