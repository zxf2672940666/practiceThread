package com.safe.wrong.setNewStringTwoLock;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService=new MyService();
        Thread1 thread1=new Thread1(myService);
        thread1.setName("a");
        Thread2 thread2=new Thread2(myService);
        thread2.setName("b");
        thread1.start();
        Thread.sleep(50);
        thread2.start();
    }
}
