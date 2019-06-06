package com.safe.t2;


public class Thread2 extends Thread {
    private HasSelfPrivateNum numRef;

    public Thread2(HasSelfPrivateNum numRef){
        this.numRef=numRef;
    }
    @Override
    public void run() {
        numRef.add("b");
    }
}
