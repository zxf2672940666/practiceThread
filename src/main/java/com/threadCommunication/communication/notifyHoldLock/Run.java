package com.threadCommunication.communication.notifyHoldLock;

public class Run {

    public static void main(String[] args) {
        Object lock=new Object();
        Thread1 thread1=new Thread1(lock);
        thread1.start();

        NotifyThread notifyThread=new NotifyThread(lock);
        notifyThread.start();

        synNotifyMethodThread synNotifyMethodThread=new synNotifyMethodThread(lock);
        synNotifyMethodThread.start();
    }
}
