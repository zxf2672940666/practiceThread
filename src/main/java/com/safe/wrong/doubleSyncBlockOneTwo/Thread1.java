package com.safe.wrong.doubleSyncBlockOneTwo;


public class Thread1 extends Thread {
    private ObjectService objectService;

    public Thread1(ObjectService objectService){
        this.objectService=objectService;
    }
    @Override
    public void run() {
        super.run();
        objectService.serviceMethodA();
    }
}
