package com.safe.wrong.test1;

public class Run2 {
    public static void main(String[] args) {
        Service service=new Service();
        MyObject object1=new MyObject();
        MyObject object2=new MyObject();
        Thread1 thread1=new Thread1(service,object1);
        thread1.setName("A");
        thread1.start();

        Thread2 thread2=new Thread2(service,object2);
        thread2.setName("B");
        thread2.start();
    }
}
