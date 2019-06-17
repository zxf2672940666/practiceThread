package com.threadCommunication.join.joinMoreTest;

public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        Thread2 thread2 = new Thread2();
        Thread1 thread1 = new Thread1(thread2);
        thread1.start();
        thread2.start();
        thread2.join(2000);
        System.out.println("main end" + System.currentTimeMillis());

    }
}
