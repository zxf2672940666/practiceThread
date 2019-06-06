package com.safe.twoObjectTwoLock;

public class Thread2 extends Thread {
    private HasSelfPrivateNum numRef;

    public Thread2(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    public Thread2() {
    }

    @Override
    public void run() {
        numRef.add("b");
    }
}
