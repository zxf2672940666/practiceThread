package com.useLock.useReentrantLock.lockMethodTest3.test3;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
//            isLocked查询此锁定是否由任意线程保持
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
