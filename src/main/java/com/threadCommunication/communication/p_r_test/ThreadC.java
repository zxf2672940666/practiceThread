package com.threadCommunication.communication.p_r_test;

public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.getValue();
    }
}
