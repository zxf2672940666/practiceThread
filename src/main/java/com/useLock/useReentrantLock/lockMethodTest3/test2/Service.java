package com.useLock.useReentrantLock.lockMethodTest3.test2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
//            isHeldByCurrentThread查询当前线程是否保持锁定
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}
