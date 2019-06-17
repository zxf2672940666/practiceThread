package com.useLock.useReentrantLock.fair_noFair_test;

public class Run {

    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
