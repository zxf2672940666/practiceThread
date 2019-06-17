package com.useLock.useReentrantLock.ConditionTestManyToMany;


public class Thread1 extends Thread {
    private Service service;

    public Thread1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            service.set();
        }
    }
}
