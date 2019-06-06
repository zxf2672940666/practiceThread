package com.safe.wrong.test1;

public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        MyObject object=new MyObject();
        Thread1 thread1=new Thread1(service,object);
        thread1.setName("A");
        thread1.start();

        Thread2 thread2=new Thread2(service,object);
        thread2.setName("B");
        thread2.start();
    }
}
