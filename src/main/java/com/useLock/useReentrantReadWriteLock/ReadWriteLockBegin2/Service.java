package com.useLock.useReentrantReadWriteLock.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    public ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获取写锁" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
