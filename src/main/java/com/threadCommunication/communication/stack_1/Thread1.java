package com.threadCommunication.communication.stack_1;

public class Thread1 extends Thread {
    private P p;

    public Thread1(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.pushService();
    }
}
