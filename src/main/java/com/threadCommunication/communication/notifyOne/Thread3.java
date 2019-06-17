package com.threadCommunication.communication.notifyOne;

public class Thread3 extends Thread {
    private Object lock;

    public Thread3(Object lock){
        this.lock=lock;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
