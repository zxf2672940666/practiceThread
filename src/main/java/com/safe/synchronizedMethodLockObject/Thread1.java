package com.safe.synchronizedMethodLockObject;

public class Thread1 extends Thread {
    private MyObject object;

    public Thread1(MyObject object){
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
