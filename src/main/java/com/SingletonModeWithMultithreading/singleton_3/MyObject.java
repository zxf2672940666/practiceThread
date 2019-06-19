package com.SingletonModeWithMultithreading.singleton_3;

public class MyObject {

    private static MyObject myObject;

    private MyObject() {

    }


    public static MyObject getInstance() {
        if (myObject != null) {

        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            虽然部分代码上锁但还是有非线程安全问题
            synchronized (MyObject.class) {
                myObject = new MyObject();
            }
        }
        return myObject;

    }
}
