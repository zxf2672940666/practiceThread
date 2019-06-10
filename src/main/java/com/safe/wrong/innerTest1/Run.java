package com.safe.wrong.innerTest1;

public class Run {

    public static void main(String[] args) {
        final OutClass outClass=new OutClass();
        Thread thread1=new Thread(new Runnable() {
            public void run() {
                outClass.method1();
            }
        },"A");
        Thread thread2=new Thread(new Runnable() {
            public void run() {
                outClass.method2();
            }
        },"B");
        thread1.start();
        thread2.start();
    }
}
