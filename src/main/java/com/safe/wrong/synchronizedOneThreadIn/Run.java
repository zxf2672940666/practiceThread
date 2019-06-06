package com.safe.wrong.synchronizedOneThreadIn;

public class Run {

    public static void main(String[] args) {
        ObjectService objectService=new ObjectService();
        Thread1 thread1=new Thread1(objectService);
        thread1.setName("a");
        thread1.start();

        Thread2 thread2=new Thread2(objectService);
        thread2.setName("b");
        thread2.start();
    }
}
