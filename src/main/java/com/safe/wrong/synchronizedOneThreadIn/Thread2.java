package com.safe.wrong.synchronizedOneThreadIn;

public class Thread2 extends Thread {
    private ObjectService objectService;

    public Thread2(ObjectService objectService){
        this.objectService=objectService;
    }
    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}
