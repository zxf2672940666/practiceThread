package com.safe.wrong.StringAndSyn2;

public class Thread2 extends Thread {
    private Service service;

    public Thread2(Service service){
        this.service=service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
