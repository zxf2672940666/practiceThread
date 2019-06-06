package com.pa.interrupt;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThread a=new MyThread();
        a.start();
        Thread.sleep(2000);
        a.interrupt();
    }
}
