package com.safe.t1;

public class Thread1 extends Thread {
    private HasSelfPrivateNum numRef;

    public Thread1(HasSelfPrivateNum numRef){
        this.numRef=numRef;
    }
    @Override
    public void run() {
        numRef.add("a");
    }
}
