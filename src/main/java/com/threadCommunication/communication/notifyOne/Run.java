package com.threadCommunication.communication.notifyOne;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        Thread1 thread1=new Thread1(lock);
        thread1.start();
        Thread2 thread2=new Thread2(lock);
        thread2.start();
        Thread3 thread3=new Thread3(lock);
        thread3.start();
        Thread.sleep(1000);
        NotifyThread notifyThread=new NotifyThread(lock);
        notifyThread.start();
    }
}
