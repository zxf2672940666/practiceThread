package com.useLock.useReentrantLock.tryLockTest;

public class Run {

    public static void main(String[] args) {
        final Service service=new Service();
        Runnable runnable=new Runnable() {
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread1=new Thread(runnable);
        thread1.setName("A");
        thread1.start();

        Thread thread2=new Thread(runnable);
        thread2.setName("B ");
        thread2.start();
    }
}
