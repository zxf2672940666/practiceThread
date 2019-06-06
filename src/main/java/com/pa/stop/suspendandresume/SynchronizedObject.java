package com.pa.stop.suspendandresume;

public class SynchronizedObject {

    public synchronized void prinString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("线程A 永远的susped了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
