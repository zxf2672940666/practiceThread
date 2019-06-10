package com.safe.wrong.twoStop;

public class Thread2 extends Thread {
    private Service service;

    public Thread2(Service service){
        this.service=service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
