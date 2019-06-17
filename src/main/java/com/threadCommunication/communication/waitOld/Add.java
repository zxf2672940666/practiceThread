package com.threadCommunication.communication.waitOld;

public class Add {

    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("zxf");
            lock.notifyAll();
        }
    }
}
