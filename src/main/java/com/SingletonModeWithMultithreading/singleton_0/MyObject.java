package com.SingletonModeWithMultithreading.singleton_0;

public class MyObject {
    //    立即加载方式==饿汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {

    }

    public static MyObject getInstance() {
        return myObject;
    }
}
