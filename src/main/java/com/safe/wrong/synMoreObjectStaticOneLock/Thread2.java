package com.safe.wrong.synMoreObjectStaticOneLock;


public class Thread2 extends Thread {
    private Service service;

    public Thread2(Service service){
        this.service=service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
