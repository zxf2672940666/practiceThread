package com.SingletonModeWithMultithreading.singleton_0;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
