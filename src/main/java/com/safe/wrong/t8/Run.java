package com.safe.wrong.t8;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Task task=new Task();
        Thread1 thread1=new Thread1(task);
        thread1.start();
        Thread.sleep(10);
        Thread2 thread2=new Thread2(task);
        thread2.start();
    }
}
