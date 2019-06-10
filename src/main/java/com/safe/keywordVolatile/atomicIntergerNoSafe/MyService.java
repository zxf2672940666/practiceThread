package com.safe.keywordVolatile.atomicIntergerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
    public static AtomicLong atomicLong = new AtomicLong();

    public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值:" + atomicLong.addAndGet(100));
        atomicLong.addAndGet(1);
    }
}
