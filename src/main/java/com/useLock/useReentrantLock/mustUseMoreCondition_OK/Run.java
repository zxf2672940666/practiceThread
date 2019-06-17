package com.useLock.useReentrantLock.mustUseMoreCondition_OK;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService=new MyService();
        Thread1 thread1=new Thread1(myService);
        thread1.setName("a");
        thread1.start();

        Thread2 thread2=new Thread2(myService);
        thread2.setName("b");
        thread2.start();

        Thread.sleep(5000);
        myService.signalAll_1();
        myService.signalAll_2();
    }
}
