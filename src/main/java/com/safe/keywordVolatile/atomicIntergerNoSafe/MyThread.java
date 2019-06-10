package com.safe.keywordVolatile.atomicIntergerNoSafe;

public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
