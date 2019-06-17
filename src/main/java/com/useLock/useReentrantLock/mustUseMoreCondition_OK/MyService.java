package com.useLock.useReentrantLock.mustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA时间为=" + System.currentTimeMillis() + " threadName=" + Thread.currentThread().getName());
            condition1.await();
            System.out.println("end awaitA时间为=" + System.currentTimeMillis() + " threadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB时间为=" + System.currentTimeMillis() + " threadName=" + Thread.currentThread().getName());
            condition2.await();
            System.out.println("end awaitB时间为=" + System.currentTimeMillis() + " threadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_1() {
        try {
            lock.lock();
            System.out.println("signal-1 时间为" + System.currentTimeMillis() + " threadName=" + Thread.currentThread().getName());
            condition1.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_2() {
        try {
            lock.lock();
            System.out.println("signal-2 时间为" + System.currentTimeMillis() + " threadName=" + Thread.currentThread().getName());
            condition2.signalAll();
        } finally {
            lock.unlock();
        }
    }

}
