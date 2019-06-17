package com.threadCommunication.communication.twoThreadTransData;

public class Run {

    public static void main(String[] args) {
        MyList list=new MyList();
        Thread1 thread1=new Thread1(list);
        thread1.setName("A");
        thread1.start();

        Thread2 thread2=new Thread2(list);
        thread2.setName("B");
        thread2.start();
    }
}
