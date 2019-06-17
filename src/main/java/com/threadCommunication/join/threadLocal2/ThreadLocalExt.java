package com.threadCommunication.join.threadLocal2;

public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get得到";
    }
}
