package com.SingletonModeWithMultithreading.singleton_2;

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
            myObject = new MyObject();
        }
        return myObject;
    }
}
