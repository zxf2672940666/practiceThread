package com.threadCommunication.join.join_sleep_1;

public class Thread3 extends Thread {
    private Thread2 thread2;

    public Thread3(Thread2 thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        thread2.bService();
    }
}
