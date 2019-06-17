package com.useLock.useReentrantLock.tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "获取到锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获取到锁");
        }
    }
}
