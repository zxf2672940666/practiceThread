package com.threadCommunication.communication.notifyOne;

public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait threadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait threadName=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
