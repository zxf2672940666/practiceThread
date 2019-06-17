package com.useLock.useReentrantLock.fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("threadName=" + Thread.currentThread().getName() + "获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
