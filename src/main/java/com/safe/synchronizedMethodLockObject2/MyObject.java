package com.safe.synchronizedMethodLockObject2;

public class MyObject {

    public synchronized void methodA(){
        try {
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end"+"end time="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void methodB(){
        try {
            System.out.println("begin methodB threadName="+Thread.currentThread().getName() + "begin time ="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
