package com.safe.wrong.synMoreObjectStaticOneLock;

public class Run {

    public static void main(String[] args) {
        Service service1=new Service();
        Service service2=new Service();

        Thread1 thread1=new Thread1(service1);
        thread1.setName("a");
        thread1.start();

        Thread2 thread2=new Thread2(service2);
        thread2.setName("b");
        thread2.start();
    }
}
