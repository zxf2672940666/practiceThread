package com.threadCommunication.join.join_sleep_1;

public class Thread1 extends Thread {
    private Thread2 thread2;

    public Thread1(Thread2 thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        try {
            synchronized (thread2) {
                thread2.start();
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
