package com.threadCommunication.join.InheritableThreadLocal1;

public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值=" + Tools.inheritableThreadLocalExt.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            Thread1 thread1 = new Thread1();
            thread1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
