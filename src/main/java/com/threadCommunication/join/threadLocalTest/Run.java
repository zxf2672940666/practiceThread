package com.threadCommunication.join.threadLocalTest;

public class Run {

    public static void main(String[] args) {
        try {
            Thread1 thread1 = new Thread1();
            Thread2 thread2 = new Thread2();
            thread1.start();
            thread2.start();
            for (int i = 0; i < 100; i++) {
                Tools.threadLocal.set("Main" + " " + (i + 1));
                System.out.println("Main get Value=" + Tools.threadLocal.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
