package com.safe.wrong.test1;

public class Thread2 extends Thread {

    private Service service;
    private MyObject object;

    public Thread2(Service service, MyObject object){
        this.object=object;
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod(object);
    }
}
