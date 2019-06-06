package com.pa;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("运行中");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束");
    }
}
