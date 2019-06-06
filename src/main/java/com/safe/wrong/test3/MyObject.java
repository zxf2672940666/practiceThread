package com.safe.wrong.test3;

public class MyObject {

    public synchronized void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString__getLock time" + System.currentTimeMillis() +
                    "run ThreadName" + Thread.currentThread().getName());
            System.out.println("---------------------------------------");
            System.out.println("speedPrintString__releaseLock time" + System.currentTimeMillis() +
                    "run ThreadName" + Thread.currentThread().getName());
        }
    }
}
