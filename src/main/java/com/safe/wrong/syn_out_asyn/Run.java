package com.safe.wrong.syn_out_asyn;

public class Run {

    public static void main(String[] args) {
        MyList myList=new MyList();

        Thread1 thread1=new Thread1(myList);
        thread1.setName("A");
        thread1.start();

        Thread2 thread2=new Thread2(myList);
        thread2.setName("B");
        thread2.start();
    }
}
