package com.pa.isalive;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        System.out.println("start="+myThread.isAlive());
        myThread.start();
//        Thread.sleep(1000);
        System.out.println("end="+myThread.isAlive());
    }
}
