package com.safe.twoObjectTwoLock;

public class Thread1 extends Thread {
    private HasSelfPrivateNum numRef;

    public Thread1(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    public Thread1() {
    }

    @Override
    public void run() {
        numRef.add("a");
    }
}
