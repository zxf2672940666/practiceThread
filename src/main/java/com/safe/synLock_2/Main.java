package com.safe.synLock_2;

public class Main {
    private int i = 10;

    public synchronized void operateMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
