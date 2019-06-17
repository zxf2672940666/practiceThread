package com.useLock.useReentrantLock.lockMethodTest3.test2;

public class Run {

    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable1 = new Runnable() {
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
