package com.safe.keywordVolatile.AtomicInegerTest;

public class Run {

    public static void main(String[] args) {
        AddCountThread addCountThread=new AddCountThread();
        Thread t1=new Thread(addCountThread);
        t1.start();
        Thread t2=new Thread(addCountThread);
        t2.start();
        Thread t3=new Thread(addCountThread);
        t3.start();
        Thread t4=new Thread(addCountThread);
        t4.start();
        Thread t5=new Thread(addCountThread);
        t5.start();
    }
}
