package com.threadCommunication.communication.waitReleaseLock;

public class Thread2 extends Thread {

    private Object lock;

    public Thread2(Object lock){
        this.lock=lock;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
