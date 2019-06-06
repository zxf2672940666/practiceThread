package com.safe.wrong.t7;

public class Run {

    public static void main(String[] args) {
        Task task=new Task();
        Thread1 thread1=new Thread1(task);
        thread1.start();
        Thread2 thread2=new Thread2(task);
        thread2.start();
    }
}
