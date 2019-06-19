package com.SingletonModeWithMultithreading.singleton_2_1;

public class MyObject {

    private static MyObject myObject;

    private MyObject() {

    }

    //    设置同步方法效率太低，整个方法加锁
    public synchronized static MyObject getInstance() {
        if (myObject != null) {

        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject = new MyObject();
        }
        return myObject;
    }
}
