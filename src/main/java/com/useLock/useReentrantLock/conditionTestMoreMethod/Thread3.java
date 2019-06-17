package com.useLock.useReentrantLock.conditionTestMoreMethod;

public class Thread3 extends Thread {

    private MyService myService;

    public Thread3(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}
