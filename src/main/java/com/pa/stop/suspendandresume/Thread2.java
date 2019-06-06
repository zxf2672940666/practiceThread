package com.pa.stop.suspendandresume;

public class Thread2 extends Thread {
    private SynchronizedObject object = new SynchronizedObject();

    @Override
    public void run() {
        System.out.println("thread2 启动了，但进入不了prinString()方法！只打印1个begin");
        System.out.println("因为prinString()方法被a线程锁定并且永远的suspend了");
        object.prinString();
    }
}
