package com.useLock.useReentrantLock.ConditionTestManyToMany;


public class Thread2 extends Thread {
    private Service service;

    public Thread2(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            service.get();
        }
    }
}
