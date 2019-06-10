package com.safe.wrong.syncStaticMethod;

public class Run {

    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.setName("a");
        thread1.start();

        Thread2 thread2=new Thread2();
        thread2.setName("b");
        thread2.start();
    }
}
