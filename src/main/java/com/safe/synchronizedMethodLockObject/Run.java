package com.safe.synchronizedMethodLockObject;

public class Run {

    public static void main(String[] args) {
        MyObject object=new MyObject();
        Thread1 thread1=new Thread1(object);
        Thread2 thread2=new Thread2(object);
        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();
    }
}
