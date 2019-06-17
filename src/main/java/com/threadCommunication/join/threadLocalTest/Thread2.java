package com.threadCommunication.join.threadLocalTest;

public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.threadLocal.set("Thread2" + " " + (i + 1));
                System.out.println("Thread2 get Value=" + Tools.threadLocal.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
