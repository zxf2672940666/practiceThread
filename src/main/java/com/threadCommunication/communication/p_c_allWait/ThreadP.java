package com.threadCommunication.communication.p_c_allWait;


public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.setValue();
    }
}
