package com.safe.wrong.test2;

public class Run {

    public static void main(String[] args) {
        Service service=new Service();
        MyObject object=new MyObject();

        Thread1 thread1=new Thread1(service,object);
        thread1.setName("a");
        thread1.start();

        Thread2 thread2=new Thread2(object);
        thread2.setName("b");
        thread2.start();
    }
}
