package com.safe.synchronizedMethodLockObject2;


public class Run {

    public static void main(String[] args) {
        MyObject object=new MyObject();
        Thread1 thread1=new Thread1(object);
        thread1.setName("A");
        Thread2 thread2=new Thread2(object);
        thread2.setName("B");
        thread1.start();
        thread2.start();
    }
}
