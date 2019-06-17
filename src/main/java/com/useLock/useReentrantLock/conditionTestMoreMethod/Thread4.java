package com.useLock.useReentrantLock.conditionTestMoreMethod;

public class Thread4 extends Thread {

    private MyService myService;

    public Thread4(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}
