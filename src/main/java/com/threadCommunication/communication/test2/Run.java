package com.threadCommunication.communication.test2;

public class Run {

    public static void main(String[] args) {
        try {
            Object lock=new Object();
            Thread1 thread1=new Thread1(lock);
            thread1.start();
            Thread.sleep(3000);
            Thread2 thread2=new Thread2(lock);
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
