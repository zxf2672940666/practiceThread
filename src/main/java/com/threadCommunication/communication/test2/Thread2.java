package com.threadCommunication.communication.test2;

public class Thread2 extends Thread {
    private Object lock;

    public Thread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始  notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束  notify time=" + System.currentTimeMillis());
        }
    }
}
