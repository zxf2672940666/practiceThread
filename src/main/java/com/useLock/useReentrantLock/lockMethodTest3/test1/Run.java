package com.useLock.useReentrantLock.lockMethodTest3.test1;

public class Run {

    public static void main(String[] args) {
        final Service service1=new Service(true);
        Runnable runnable1=new Runnable() {
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread1=new Thread(runnable1);
        thread1.start();

        final Service service2=new Service(false);
        Runnable runnable2 =new Runnable() {
            public void run() {
                service2.serviceMethod();
            }
        };
        Thread thread2=new Thread(runnable2);
        thread2.start();
    }
}
