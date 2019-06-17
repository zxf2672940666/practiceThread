package com.useLock.useReentrantLock.lockInterruptiblyTest1;

public class Run {

    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.setName("a");
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.setName("b");
        thread2.start();
        thread2.interrupt();
        System.out.println("main end");
    }
}
