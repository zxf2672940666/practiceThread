package com.SingletonModeWithMultithreading.singleton_2;

public class Run {
//    不能保证单例，
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}
