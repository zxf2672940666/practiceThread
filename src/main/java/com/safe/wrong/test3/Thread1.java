package com.safe.wrong.test3;

public class Thread1 extends Thread {

    private Service service;
    private MyObject object;

    public Thread1(Service service, MyObject object){
        this.object=object;
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod(object);
    }
}
