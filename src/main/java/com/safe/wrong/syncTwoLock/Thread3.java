package com.safe.wrong.syncTwoLock;

public class Thread3 extends Thread {
    private Service service;

    public Thread3(Service service){
        this.service=service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
