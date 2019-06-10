package com.safe.keywordVolatile.AtomicInegerTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger atomicInteger=new AtomicInteger(0);

    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println(Thread.currentThread().getName()+" "+atomicInteger.incrementAndGet());
        }
    }
}
