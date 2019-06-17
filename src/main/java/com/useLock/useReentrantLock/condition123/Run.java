package com.useLock.useReentrantLock.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {
    private volatile static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    private final static Condition condition1 = lock.newCondition();
    private final static Condition condition2 = lock.newCondition();
    private final static Condition condition3 = lock.newCondition();

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 1) {
                        condition1.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("thread1 " + (i + 1));
                        nextPrintWho = 2;
                        condition2.signalAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };


        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 2) {
                        condition2.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("thread2 " + (i + 1));
                        nextPrintWho = 3;
                        condition3.signalAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 3) {
                        condition3.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("thread3 " + (i + 1));
                        nextPrintWho = 1;
                        condition1.signalAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread[] threads1 = new Thread[5];
        Thread[] threads2 = new Thread[5];
        Thread[] threads3 = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads1[i] = new Thread(thread1);
            threads2[i] = new Thread(thread2);
            threads3[i] = new Thread(thread3);

            threads1[i].start();
            threads2[i].start();
            threads3[i].start();
        }
    }
}
