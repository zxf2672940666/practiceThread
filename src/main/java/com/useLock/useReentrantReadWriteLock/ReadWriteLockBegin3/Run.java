package com.useLock.useReentrantReadWriteLock.ReadWriteLockBegin3;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();

        Thread1 thread1=new Thread1(service);
        thread1.setName("A");
        thread1.start();

        Thread.sleep(1000);

        Thread2 thread2=new Thread2(service);
        thread2.setName("B");
        thread2.start();
    }
}
