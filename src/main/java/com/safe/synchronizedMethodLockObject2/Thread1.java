package com.safe.synchronizedMethodLockObject2;

public class Thread1 extends Thread {
    private MyObject object;

    public Thread1(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
