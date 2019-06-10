package com.safe.wrong.StringAndSyn;

public class Run {

    public static void main(String[] args) {
        Service service=new Service();

        Thread1 thread1=new Thread1(service);
        thread1.setName("a");
        thread1.start();

        Thread2 thread2=new Thread2(service);
        thread2.setName("b");
        thread2.start();
    }
}
