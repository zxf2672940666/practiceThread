package com.pa.abnormal;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (Thread.interrupted()) {
                System.out.println("停止了");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
