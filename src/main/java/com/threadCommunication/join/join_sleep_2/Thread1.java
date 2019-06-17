package com.threadCommunication.join.join_sleep_2;

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
                thread2.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
