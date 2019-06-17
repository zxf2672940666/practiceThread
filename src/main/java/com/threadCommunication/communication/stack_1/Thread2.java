package com.threadCommunication.communication.stack_1;

public class Thread2 extends Thread {
    private C c;

    public Thread2(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.popService();
    }
}
