package com.safe.wrong.t9;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyOneList list=new MyOneList();

        Thread1 thread1=new Thread1(list);
        thread1.setName("A");
        thread1.start();

        Thread2 thread2=new Thread2(list);
        thread2.setName("B");
        thread2.start();

        Thread.sleep(6000);
        System.out.println("ListSize="+list.getSize());
    }
}
