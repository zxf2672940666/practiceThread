package com.safe.wrong.deadLockTest;

public class Run {

    public static void main(String[] args) {
        try {
            DeadThread deadThread = new DeadThread();
            deadThread.setFlag("a");
            Thread thread1 = new Thread(deadThread);
            thread1.start();
            Thread.sleep(100);
            deadThread.setFlag("b");
            Thread thread2 = new Thread(deadThread);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
