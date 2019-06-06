package com.safe.synchronizedMethodLockObject2;

public class Thread2 extends Thread {
    private MyObject object;

    public Thread2(MyObject object){
        this.object=object;
    }

    @Override
    public void run() {
        object.methodB();
    }
}
