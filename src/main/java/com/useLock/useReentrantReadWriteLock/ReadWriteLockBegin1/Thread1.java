package com.useLock.useReentrantReadWriteLock.ReadWriteLockBegin1;

public class Thread1 extends Thread {

    private Service service;

    public Thread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
