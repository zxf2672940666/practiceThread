package com.useLock.useReentrantLock.lockInterruptiblyTest1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
//            lock.lock();
            lock.lockInterruptibly();
            System.out.println("lock begin=" + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String s = new String();
                Math.random();
            }
            System.out.println("lock end=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }

    }
}
