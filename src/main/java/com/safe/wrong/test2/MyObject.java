package com.safe.wrong.test2;

public class MyObject {

    public synchronized void speedPrintString(){
        System.out.println("speedPrintString__getLock time"+System.currentTimeMillis() +
                "run ThreadName"+Thread.currentThread().getName());
        System.out.println("---------------------------------------");
        System.out.println("speedPrintString__releaseLock time"+System.currentTimeMillis() +
                "run ThreadName"+Thread.currentThread().getName());

    }
}
